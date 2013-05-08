package contributions

import grails.converters.JSON

class ContributionController {

    def contributionService
    def helperService

    def getProjectByProjectId() {

        if(!params.contributionId) {
            response.status = 403 // Forbidden
            render helperService.renderError("Parameter 'projectId' is mandatory.", "403")
            return
        }

        def contribution = contributionService.getContributionByContributionId(params.contributionId as Integer)

        if (contribution) {
            response.status = 200     //Ok
            render contribution as JSON
            return
        }
        else{
            response.status = 404 // NotFound
            render helperService.renderError("Project with id "+params.contributionId+" not found.", "404")
            return
        }

    }

    def postContribution ()   {

        def data = request.JSON
        def missingParameters = helperService.validateMandatoryFields(data)

        if (missingParameters) {
            def paramsString = ""
            for (missingParameter in missingParameters) {
                paramsString += missingParameter+", "
            }
            paramsString = paramsString[0..-3]
            response.status = 403 // Forbidden
            if (missingParameters.size() == 1)
                render helperService.renderError("Parameter "+paramsString+" is mandatory.", "403")
            else
                render helperService.renderError("Parameters "+paramsString+" are mandatory.", "403")
            return
        }

        def projectJson = request.JSON
        def project = contributionService.createContribution(projectJson)
        response.status = 200
        render project as JSON

    }
}
