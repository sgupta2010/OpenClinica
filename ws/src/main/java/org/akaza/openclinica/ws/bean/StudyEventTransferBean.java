package org.akaza.openclinica.ws.bean;

import org.akaza.openclinica.bean.login.UserAccountBean;

import java.util.Date;

public class StudyEventTransferBean {

    String studySubjectId;
    String studyUniqueId;
    String siteUniqueId;
    String eventDefinitionOID;
    String location;
    Date startDateTime;
    Date endDateTime;
    UserAccountBean user;

    public StudyEventTransferBean(String studySubjectId, String studyUniqueId, String siteUniqueId, String eventDefinitionOID, String location,
            Date startDateTime, Date endDateTime, UserAccountBean user) {
        super();
        this.studySubjectId = studySubjectId;
        this.studyUniqueId = studyUniqueId;
        this.siteUniqueId = siteUniqueId;
        this.eventDefinitionOID = eventDefinitionOID;
        this.location = location;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.user = user;
    }

    public String getStudySubjectId() {
        return studySubjectId;
    }

    public void setStudySubjectId(String studySubjectId) {
        this.studySubjectId = studySubjectId;
    }

    public String getStudyUniqueId() {
        return studyUniqueId;
    }

    public void setStudyUniqueId(String studyUniqueId) {
        this.studyUniqueId = studyUniqueId;
    }

    public String getSiteUniqueId() {
        return siteUniqueId;
    }

    public void setSiteUniqueId(String siteUniqueId) {
        this.siteUniqueId = siteUniqueId;
    }

    public String getEventDefinitionOID() {
        return eventDefinitionOID;
    }

    public void setEventDefinitionOID(String eventDefinitionOID) {
        this.eventDefinitionOID = eventDefinitionOID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public UserAccountBean getUser() {
        return user;
    }

    public void setUser(UserAccountBean user) {
        this.user = user;
    }

}