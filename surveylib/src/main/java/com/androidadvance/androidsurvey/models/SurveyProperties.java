package com.androidadvance.androidsurvey.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SurveyProperties implements Serializable {

    @SerializedName("SurveyId")
    @Expose
    private String surveyId;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("IntroMessage")
    @Expose
    private String introMessage;
    @SerializedName("EndMessage")
    @Expose
    private String endMessage;
    @SerializedName("SkipIntro")
    @Expose
    private Boolean skipIntro;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The introMessage
     */
    public String getIntroMessage() {
        return introMessage;
    }

    /**
     * @param introMessage The intro_message
     */
    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }

    /**
     * @return The endMessage
     */
    public String getEndMessage() {
        return endMessage;
    }

    /**
     * @param endMessage The end_message
     */
    public void setEndMessage(String endMessage) {
        this.endMessage = endMessage;
    }

    /**
     * @return The skipIntro
     */
    public Boolean getSkipIntro() {
        return skipIntro;
    }

    /**
     * @param skipIntro The skip_intro
     */
    public void setSkipIntro(Boolean skipIntro) {
        this.skipIntro = skipIntro;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
}