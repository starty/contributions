/**
 * Created with IntelliJ IDEA.
 * User: AlejandroVieira
 * Date: 07/05/13
 * Time: 23:47
 * To change this template use File | Settings | File Templates.
 */
import contributions.Contribution

class ContributionMarshaller {

        static marshall(Contribution contribution){
            def contributionMap = [:]
            contributionMap.contributionId = contribution.contributionId
            contributionMap.siteId = contribution.siteId
            contributionMap.status = contribution.status
            contributionMap.userBackerId = contribution.userBackerId
            contributionMap.projectId = contribution.projectId
            contributionMap.backedAmount = contribution.backedAmount
            contributionMap.creationDate = contribution.creationDate
            contributionMap.lastUpdated = contribution.lastUpdated
}
}
