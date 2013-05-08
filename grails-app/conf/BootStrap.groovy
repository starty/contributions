import grails.converters.JSON
import ContributionMarshaller
import contributions.Contribution

class BootStrap {

    def init = { servletContext ->
        JSON.registerObjectMarshaller(Contribution) {ContributionMarshaller.marshall(it)}
    }

    def destroy = {
    }

}
