package contributions

class Contribution {

    Integer contributionId
    String siteId
    String status = "Pending"
    Integer userBackerId
    Integer projectId
    Double backedAmount
    Date creationDate
    Date lastUpdated

    static constraints = {
        contributionId (blank:false)
        siteId (blank:false)
        status (blank:false)
        userBackerId (blank:false)
        projectId (blank:false)
        backedAmount (blank:false)
        creationDate (blank:false)
        lastUpdated (blank:false)
    }

    static mapping = {
        table 'contribution'
        version false
        id name: 'contributionId'
    }

}
