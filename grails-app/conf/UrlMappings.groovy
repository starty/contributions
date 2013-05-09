class UrlMappings {

	static mappings = {
	/*	"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
                        */
		"/"(view:"/index")
		"500"(view:'/error')

        "/$contributionId" (controller: "contribution") {
            action =  [GET: "getProjectByProjectId"]

        }

        "/" (controller: "contribution") {
            action =  [POST: "postContribution"]

        }

        "/project/$projectId" (controller: "contribution") {
             action =  [GET: "getContributionsByProjectId"]

        }

	}
}
