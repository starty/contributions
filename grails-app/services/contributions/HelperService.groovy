package contributions

import grails.converters.JSON

class HelperService {

        def httpStatusCodes = [
                "400":"bad_request",
                "404":"not_found",
                "403":"forbidden",
                "500":"internal_server_error"
        ]

        JSON renderError(String errorMessage, String statusCode) {
            def error = [:]
            error.put("message", errorMessage)
            error.put("status_code", statusCode)
            error.put("error_type", httpStatusCodes[statusCode])
            return error as JSON
        }


        def validateMandatoryFields(def data) {

            def missingParameters = []

            if(!data.siteId) {
                missingParameters.add("siteId")
            }

            if(!data.userBackerId) {
                missingParameters.add("userBackerId")
            }

            if(!data.projectId) {
                missingParameters.add("projectId")
            }

            if(!data.backedAmount) {
                missingParameters.add("backedAmount")
            }

            return missingParameters
        }
}