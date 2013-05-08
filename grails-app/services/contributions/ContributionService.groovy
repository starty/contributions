package contributions

class ContributionService {

       def getContributionByContributionId (Integer contributionId) {

          return Contribution.findByContributionId(contributionId)
       }

       def createContribution (contributionJson) {

           Contribution contribution = new Contribution()

           contribution.setSiteId(contributionJson.siteId)
           contribution.setUserBackerId(contributionJson.userBackerId)
           contribution.setProjectId(contributionJson.projectId)
           contribution.setBackedAmount(contriubtionJson.backedAmount)

           contribution.setCreationDate(new Date () )
           contribution.setLastUpdated (new Date () )

           contribution.save(flush:true)
           return contribution

       }

       def getContributionsByProjectId (Integer projectId) {


        }
 }

