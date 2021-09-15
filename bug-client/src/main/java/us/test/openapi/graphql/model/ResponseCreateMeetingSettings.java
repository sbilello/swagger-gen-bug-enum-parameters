/*
 *  Copyright (c) 2021, Zoom and/or its affiliates. All rights reserved.
 */
package us.test.openapi.graphql.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Meeting settings.
 */
@Schema(description = "Meeting settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class ResponseCreateMeetingSettings {
  @JsonProperty("host_video")
  private Boolean hostVideo = null;

  @JsonProperty("participant_video")
  private Boolean participantVideo = null;

  @JsonProperty("cn_meeting")
  private Boolean cnMeeting = false;

  @JsonProperty("in_meeting")
  private Boolean inMeeting = false;

  @JsonProperty("join_before_host")
  private Boolean joinBeforeHost = false;

  /**
   * If the value of \&quot;join_before_host\&quot; field is set to true, this field can be used to
   * indicate time limits within which a participant may join a meeting before a host. The value of
   * this field can be one of the following: * &#x60;0&#x60;: Allow participant to join anytime. *
   * &#x60;5&#x60;: Allow participant to join 5 minutes before meeting start time. * &#x60;10&#x60;:
   * Allow participant to join 10 minutes before meeting start time.
   */
  public enum JbhTimeEnum {
    NUMBER_0(0), NUMBER_5(5), NUMBER_10(10);

    private Integer value;

    JbhTimeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JbhTimeEnum fromValue(String text) {
      for (JbhTimeEnum b : JbhTimeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("jbh_time")
  private JbhTimeEnum jbhTime = null;

  @JsonProperty("mute_upon_entry")
  private Boolean muteUponEntry = false;

  @JsonProperty("watermark")
  private Boolean watermark = false;

  @JsonProperty("use_pmi")
  private Boolean usePmi = false;

  /**
   * Enable registration and set approval for the registration. Note that this feature requires the
   * host to be of **Licensed** user type. **Registration cannot be enabled for a basic user.**
   * &lt;br&gt;&lt;br&gt; &#x60;0&#x60; - Automatically approve.&lt;br&gt;&#x60;1&#x60; - Manually
   * approve.&lt;br&gt;&#x60;2&#x60; - No registration required.
   */
  public enum ApprovalTypeEnum {
    NUMBER_0(0), NUMBER_1(1), NUMBER_2(2);

    private Integer value;

    ApprovalTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalTypeEnum fromValue(String text) {
      for (ApprovalTypeEnum b : ApprovalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("approval_type")
  private ApprovalTypeEnum approvalType = ApprovalTypeEnum.NUMBER_2;

  /**
   * Registration type. Used for recurring meeting with fixed time only. &lt;br&gt;&#x60;1&#x60;
   * Attendees register once and can attend any of the occurrences.&lt;br&gt;&#x60;2&#x60; Attendees
   * need to register for each occurrence to attend.&lt;br&gt;&#x60;3&#x60; Attendees register once
   * and can choose one or more occurrences to attend.
   */
  public enum RegistrationTypeEnum {
    NUMBER_1(1), NUMBER_2(2), NUMBER_3(3);

    private Integer value;

    RegistrationTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RegistrationTypeEnum fromValue(String text) {
      for (RegistrationTypeEnum b : RegistrationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("registration_type")
  private RegistrationTypeEnum registrationType = RegistrationTypeEnum.NUMBER_1;

  /**
   * Determine how participants can join the audio portion of the meeting.&lt;br&gt;&#x60;both&#x60; -
   * Both Telephony and VoIP.&lt;br&gt;&#x60;telephony&#x60; - Telephony
   * only.&lt;br&gt;&#x60;voip&#x60; - VoIP only.
   */
  public enum AudioEnum {
    BOTH("both"), TELEPHONY("telephony"), VOIP("voip");

    private String value;

    AudioEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AudioEnum fromValue(String text) {
      for (AudioEnum b : AudioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("audio")
  private AudioEnum audio = AudioEnum.BOTH;

  /**
   * Automatic recording:&lt;br&gt;&#x60;local&#x60; - Record on local.&lt;br&gt;&#x60;cloud&#x60; -
   * Record on cloud.&lt;br&gt;&#x60;none&#x60; - Disabled.
   */
  public enum AutoRecordingEnum {
    LOCAL("local"), CLOUD("cloud"), NONE("none");

    private String value;

    AutoRecordingEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AutoRecordingEnum fromValue(String text) {
      for (AutoRecordingEnum b : AutoRecordingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("auto_recording")
  private AutoRecordingEnum autoRecording = AutoRecordingEnum.NONE;

  @JsonProperty("enforce_login")
  private Boolean enforceLogin = null;

  @JsonProperty("enforce_login_domains")
  private String enforceLoginDomains = null;

  @JsonProperty("alternative_hosts")
  private String alternativeHosts = null;

  @JsonProperty("close_registration")
  private Boolean closeRegistration = false;

  @JsonProperty("waiting_room")
  private Boolean waitingRoom = false;

  @JsonProperty("global_dial_in_countries")
  private List<String> globalDialInCountries = null;

  @JsonProperty("global_dial_in_numbers")
  private List<ResponseCreateMeetingSettingsGlobalDialInNumbers> globalDialInNumbers = null;

  @JsonProperty("contact_name")
  private String contactName = null;

  @JsonProperty("contact_email")
  private String contactEmail = null;

  @JsonProperty("registrants_email_notification")
  private Boolean registrantsEmailNotification = null;

  @JsonProperty("registrants_confirmation_email")
  private Boolean registrantsConfirmationEmail = null;

  @JsonProperty("meeting_authentication")
  private Boolean meetingAuthentication = null;

  @JsonProperty("authentication_option")
  private String authenticationOption = null;

  @JsonProperty("authentication_domains")
  private String authenticationDomains = null;

  @JsonProperty("authentication_name")
  private String authenticationName = null;

  @JsonProperty("show_share_button")
  private Boolean showShareButton = null;

  @JsonProperty("allow_multiple_devices")
  private Boolean allowMultipleDevices = null;

  /**
   * Choose between enhanced encryption and [end-to-end
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871) when starting or a meeting.
   * When using end-to-end encryption, several features (e.g. cloud recording, phone/SIP/H.323
   * dial-in) will be **automatically disabled**. &lt;br&gt;&lt;br&gt;The value of this field can be
   * one of the following:&lt;br&gt; &#x60;enhanced_encryption&#x60;: Enhanced encryption. Encryption
   * is stored in the cloud if you enable this option. &lt;br&gt; &#x60;e2ee&#x60;: [End-to-end
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871). The encryption key is stored
   * in your local device and can not be obtained by anyone else. Enabling this setting also
   * **disables** the following features: join before host, cloud recording, streaming, live
   * transcription, breakout rooms, polling, 1:1 private chat, and meeting reactions.
   */
  public enum EncryptionTypeEnum {
    ENHANCED_ENCRYPTION("enhanced_encryption"), E2EE("e2ee");

    private String value;

    EncryptionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EncryptionTypeEnum fromValue(String text) {
      for (EncryptionTypeEnum b : EncryptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("encryption_type")
  private EncryptionTypeEnum encryptionType = null;

  @JsonProperty("approved_or_denied_countries_or_regions")
  private ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions = null;

  @JsonProperty("authentication_exception")
  private List<ResponseCreateMeetingSettingsAuthenticationException> authenticationException = null;

  @JsonProperty("breakout_room")
  private ResponseCreateMeetingSettingsBreakoutRoom breakoutRoom = null;

  @JsonProperty("language_interpretation")
  private ResponseCreateMeetingSettingsLanguageInterpretation languageInterpretation = null;

  @JsonProperty("custom_keys")
  private List<ResponseCreateMeetingSettingsCustomKeys> customKeys = null;

  @JsonProperty("alternative_hosts_email_notification")
  private Boolean alternativeHostsEmailNotification = true;

  public ResponseCreateMeetingSettings hostVideo(Boolean hostVideo) {
    this.hostVideo = hostVideo;
    return this;
  }

  /**
   * Start video when the host joins the meeting.
   * 
   * @return hostVideo
   **/
  @Schema(description = "Start video when the host joins the meeting.")
  public Boolean isHostVideo() {
    return hostVideo;
  }

  public void setHostVideo(Boolean hostVideo) {
    this.hostVideo = hostVideo;
  }

  public ResponseCreateMeetingSettings participantVideo(Boolean participantVideo) {
    this.participantVideo = participantVideo;
    return this;
  }

  /**
   * Start video when participants join the meeting.
   * 
   * @return participantVideo
   **/
  @Schema(description = "Start video when participants join the meeting.")
  public Boolean isParticipantVideo() {
    return participantVideo;
  }

  public void setParticipantVideo(Boolean participantVideo) {
    this.participantVideo = participantVideo;
  }

  public ResponseCreateMeetingSettings cnMeeting(Boolean cnMeeting) {
    this.cnMeeting = cnMeeting;
    return this;
  }

  /**
   * Host meeting in China.
   * 
   * @return cnMeeting
   **/
  @Schema(description = "Host meeting in China.")
  public Boolean isCnMeeting() {
    return cnMeeting;
  }

  public void setCnMeeting(Boolean cnMeeting) {
    this.cnMeeting = cnMeeting;
  }

  public ResponseCreateMeetingSettings inMeeting(Boolean inMeeting) {
    this.inMeeting = inMeeting;
    return this;
  }

  /**
   * Host meeting in India.
   * 
   * @return inMeeting
   **/
  @Schema(description = "Host meeting in India.")
  public Boolean isInMeeting() {
    return inMeeting;
  }

  public void setInMeeting(Boolean inMeeting) {
    this.inMeeting = inMeeting;
  }

  public ResponseCreateMeetingSettings joinBeforeHost(Boolean joinBeforeHost) {
    this.joinBeforeHost = joinBeforeHost;
    return this;
  }

  /**
   * Allow participants to join the meeting before the host starts the meeting. Only used for
   * scheduled or recurring meetings.
   * 
   * @return joinBeforeHost
   **/
  @Schema(description = "Allow participants to join the meeting before the host starts the meeting. Only used for scheduled or recurring meetings.")
  public Boolean isJoinBeforeHost() {
    return joinBeforeHost;
  }

  public void setJoinBeforeHost(Boolean joinBeforeHost) {
    this.joinBeforeHost = joinBeforeHost;
  }

  public ResponseCreateMeetingSettings jbhTime(JbhTimeEnum jbhTime) {
    this.jbhTime = jbhTime;
    return this;
  }

  /**
   * If the value of \&quot;join_before_host\&quot; field is set to true, this field can be used to
   * indicate time limits within which a participant may join a meeting before a host. The value of
   * this field can be one of the following: * &#x60;0&#x60;: Allow participant to join anytime. *
   * &#x60;5&#x60;: Allow participant to join 5 minutes before meeting start time. * &#x60;10&#x60;:
   * Allow participant to join 10 minutes before meeting start time.
   * 
   * @return jbhTime
   **/
  @Schema(description = "If the value of \"join_before_host\" field is set to true, this field can be used to indicate time limits within which a participant may join a meeting before a host. The value of this field can be one of the following:  *  `0`: Allow participant to join anytime. *  `5`: Allow participant to join 5 minutes before meeting start time.  * `10`: Allow participant to join 10 minutes before meeting start time.")
  public JbhTimeEnum getJbhTime() {
    return jbhTime;
  }

  public void setJbhTime(JbhTimeEnum jbhTime) {
    this.jbhTime = jbhTime;
  }

  public ResponseCreateMeetingSettings muteUponEntry(Boolean muteUponEntry) {
    this.muteUponEntry = muteUponEntry;
    return this;
  }

  /**
   * Mute participants upon entry.
   * 
   * @return muteUponEntry
   **/
  @Schema(description = "Mute participants upon entry.")
  public Boolean isMuteUponEntry() {
    return muteUponEntry;
  }

  public void setMuteUponEntry(Boolean muteUponEntry) {
    this.muteUponEntry = muteUponEntry;
  }

  public ResponseCreateMeetingSettings watermark(Boolean watermark) {
    this.watermark = watermark;
    return this;
  }

  /**
   * Add watermark when viewing a shared screen.
   * 
   * @return watermark
   **/
  @Schema(description = "Add watermark when viewing a shared screen.")
  public Boolean isWatermark() {
    return watermark;
  }

  public void setWatermark(Boolean watermark) {
    this.watermark = watermark;
  }

  public ResponseCreateMeetingSettings usePmi(Boolean usePmi) {
    this.usePmi = usePmi;
    return this;
  }

  /**
   * Use a personal meeting ID. Only used for scheduled meetings and recurring meetings with no fixed
   * time.
   * 
   * @return usePmi
   **/
  @Schema(description = "Use a personal meeting ID. Only used for scheduled meetings and recurring meetings with no fixed time.")
  public Boolean isUsePmi() {
    return usePmi;
  }

  public void setUsePmi(Boolean usePmi) {
    this.usePmi = usePmi;
  }

  public ResponseCreateMeetingSettings approvalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
    return this;
  }

  /**
   * Enable registration and set approval for the registration. Note that this feature requires the
   * host to be of **Licensed** user type. **Registration cannot be enabled for a basic user.**
   * &lt;br&gt;&lt;br&gt; &#x60;0&#x60; - Automatically approve.&lt;br&gt;&#x60;1&#x60; - Manually
   * approve.&lt;br&gt;&#x60;2&#x60; - No registration required.
   * 
   * @return approvalType
   **/
  @Schema(description = "Enable registration and set approval for the registration. Note that this feature requires the host to be of **Licensed** user type. **Registration cannot be enabled for a basic user.** <br><br>  `0` - Automatically approve.<br>`1` - Manually approve.<br>`2` - No registration required.")
  public ApprovalTypeEnum getApprovalType() {
    return approvalType;
  }

  public void setApprovalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
  }

  public ResponseCreateMeetingSettings registrationType(RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
    return this;
  }

  /**
   * Registration type. Used for recurring meeting with fixed time only. &lt;br&gt;&#x60;1&#x60;
   * Attendees register once and can attend any of the occurrences.&lt;br&gt;&#x60;2&#x60; Attendees
   * need to register for each occurrence to attend.&lt;br&gt;&#x60;3&#x60; Attendees register once
   * and can choose one or more occurrences to attend.
   * 
   * @return registrationType
   **/
  @Schema(description = "Registration type. Used for recurring meeting with fixed time only. <br>`1` Attendees register once and can attend any of the occurrences.<br>`2` Attendees need to register for each occurrence to attend.<br>`3` Attendees register once and can choose one or more occurrences to attend.")
  public RegistrationTypeEnum getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
  }

  public ResponseCreateMeetingSettings audio(AudioEnum audio) {
    this.audio = audio;
    return this;
  }

  /**
   * Determine how participants can join the audio portion of the meeting.&lt;br&gt;&#x60;both&#x60; -
   * Both Telephony and VoIP.&lt;br&gt;&#x60;telephony&#x60; - Telephony
   * only.&lt;br&gt;&#x60;voip&#x60; - VoIP only.
   * 
   * @return audio
   **/
  @Schema(description = "Determine how participants can join the audio portion of the meeting.<br>`both` - Both Telephony and VoIP.<br>`telephony` - Telephony only.<br>`voip` - VoIP only.")
  public AudioEnum getAudio() {
    return audio;
  }

  public void setAudio(AudioEnum audio) {
    this.audio = audio;
  }

  public ResponseCreateMeetingSettings autoRecording(AutoRecordingEnum autoRecording) {
    this.autoRecording = autoRecording;
    return this;
  }

  /**
   * Automatic recording:&lt;br&gt;&#x60;local&#x60; - Record on local.&lt;br&gt;&#x60;cloud&#x60; -
   * Record on cloud.&lt;br&gt;&#x60;none&#x60; - Disabled.
   * 
   * @return autoRecording
   **/
  @Schema(description = "Automatic recording:<br>`local` - Record on local.<br>`cloud` -  Record on cloud.<br>`none` - Disabled.")
  public AutoRecordingEnum getAutoRecording() {
    return autoRecording;
  }

  public void setAutoRecording(AutoRecordingEnum autoRecording) {
    this.autoRecording = autoRecording;
  }

  public ResponseCreateMeetingSettings enforceLogin(Boolean enforceLogin) {
    this.enforceLogin = enforceLogin;
    return this;
  }

  /**
   * Only signed in users can join this meeting. **This field is deprecated and will not be supported
   * in the future.** &lt;br&gt;&lt;br&gt;As an alternative, use the
   * \&quot;meeting_authentication\&quot;, \&quot;authentication_option\&quot; and
   * \&quot;authentication_domains\&quot; fields to understand the [authentication
   * configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars)
   * set for the meeting.
   * 
   * @return enforceLogin
   **/
  @Schema(description = "Only signed in users can join this meeting.  **This field is deprecated and will not be supported in the future.**  <br><br>As an alternative, use the \"meeting_authentication\", \"authentication_option\" and \"authentication_domains\" fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the meeting.")
  public Boolean isEnforceLogin() {
    return enforceLogin;
  }

  public void setEnforceLogin(Boolean enforceLogin) {
    this.enforceLogin = enforceLogin;
  }

  public ResponseCreateMeetingSettings enforceLoginDomains(String enforceLoginDomains) {
    this.enforceLoginDomains = enforceLoginDomains;
    return this;
  }

  /**
   * Only signed in users with specified domains can join meetings. **This field is deprecated and
   * will not be supported in the future.** &lt;br&gt;&lt;br&gt;As an alternative, use the
   * \&quot;meeting_authentication\&quot;, \&quot;authentication_option\&quot; and
   * \&quot;authentication_domains\&quot; fields to understand the [authentication
   * configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars)
   * set for the meeting.
   * 
   * @return enforceLoginDomains
   **/
  @Schema(description = "Only signed in users with specified domains can join meetings.  **This field is deprecated and will not be supported in the future.**  <br><br>As an alternative, use the \"meeting_authentication\", \"authentication_option\" and \"authentication_domains\" fields to understand the [authentication configurations](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) set for the meeting.")
  public String getEnforceLoginDomains() {
    return enforceLoginDomains;
  }

  public void setEnforceLoginDomains(String enforceLoginDomains) {
    this.enforceLoginDomains = enforceLoginDomains;
  }

  public ResponseCreateMeetingSettings alternativeHosts(String alternativeHosts) {
    this.alternativeHosts = alternativeHosts;
    return this;
  }

  /**
   * Alternative host&#x27;s emails or IDs: multiple values are separated by a semicolon.
   * 
   * @return alternativeHosts
   **/
  @Schema(description = "Alternative host's emails or IDs: multiple values are separated by a semicolon.")
  public String getAlternativeHosts() {
    return alternativeHosts;
  }

  public void setAlternativeHosts(String alternativeHosts) {
    this.alternativeHosts = alternativeHosts;
  }

  public ResponseCreateMeetingSettings closeRegistration(Boolean closeRegistration) {
    this.closeRegistration = closeRegistration;
    return this;
  }

  /**
   * Close registration after event date
   * 
   * @return closeRegistration
   **/
  @Schema(description = "Close registration after event date")
  public Boolean isCloseRegistration() {
    return closeRegistration;
  }

  public void setCloseRegistration(Boolean closeRegistration) {
    this.closeRegistration = closeRegistration;
  }

  public ResponseCreateMeetingSettings waitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
    return this;
  }

  /**
   * Enable waiting room
   * 
   * @return waitingRoom
   **/
  @Schema(description = "Enable waiting room")
  public Boolean isWaitingRoom() {
    return waitingRoom;
  }

  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }

  public ResponseCreateMeetingSettings globalDialInCountries(List<String> globalDialInCountries) {
    this.globalDialInCountries = globalDialInCountries;
    return this;
  }

  public ResponseCreateMeetingSettings addGlobalDialInCountriesItem(String globalDialInCountriesItem) {
    if (this.globalDialInCountries == null) {
      this.globalDialInCountries = new ArrayList<String>();
    }
    this.globalDialInCountries.add(globalDialInCountriesItem);
    return this;
  }

  /**
   * List of global dial-in countries
   * 
   * @return globalDialInCountries
   **/
  @Schema(description = "List of global dial-in countries")
  public List<String> getGlobalDialInCountries() {
    return globalDialInCountries;
  }

  public void setGlobalDialInCountries(List<String> globalDialInCountries) {
    this.globalDialInCountries = globalDialInCountries;
  }

  public ResponseCreateMeetingSettings globalDialInNumbers(List<ResponseCreateMeetingSettingsGlobalDialInNumbers> globalDialInNumbers) {
    this.globalDialInNumbers = globalDialInNumbers;
    return this;
  }

  public ResponseCreateMeetingSettings addGlobalDialInNumbersItem(ResponseCreateMeetingSettingsGlobalDialInNumbers globalDialInNumbersItem) {
    if (this.globalDialInNumbers == null) {
      this.globalDialInNumbers = new ArrayList<ResponseCreateMeetingSettingsGlobalDialInNumbers>();
    }
    this.globalDialInNumbers.add(globalDialInNumbersItem);
    return this;
  }

  /**
   * Global Dial-in Countries/Regions
   * 
   * @return globalDialInNumbers
   **/
  @Schema(description = "Global Dial-in Countries/Regions")
  public List<ResponseCreateMeetingSettingsGlobalDialInNumbers> getGlobalDialInNumbers() {
    return globalDialInNumbers;
  }

  public void setGlobalDialInNumbers(List<ResponseCreateMeetingSettingsGlobalDialInNumbers> globalDialInNumbers) {
    this.globalDialInNumbers = globalDialInNumbers;
  }

  public ResponseCreateMeetingSettings contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Contact name for registration
   * 
   * @return contactName
   **/
  @Schema(description = "Contact name for registration")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public ResponseCreateMeetingSettings contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Contact email for registration
   * 
   * @return contactEmail
   **/
  @Schema(description = "Contact email for registration")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public ResponseCreateMeetingSettings registrantsEmailNotification(Boolean registrantsEmailNotification) {
    this.registrantsEmailNotification = registrantsEmailNotification;
    return this;
  }

  /**
   * Whether to send registrants email notifications about their registration approval, cancellation,
   * or rejection: * &#x60;true&#x60; — Send an email notification. * &#x60;false&#x60; — Do not send
   * an email notification. Set this value to &#x60;true&#x60; to also use the
   * &#x60;registrants_confirmation_email&#x60; parameter.
   * 
   * @return registrantsEmailNotification
   **/
  @Schema(description = "Whether to send registrants email notifications about their registration approval, cancellation, or rejection:  * `true` — Send an email notification. * `false` — Do not send an email notification.   Set this value to `true` to also use the `registrants_confirmation_email` parameter.")
  public Boolean isRegistrantsEmailNotification() {
    return registrantsEmailNotification;
  }

  public void setRegistrantsEmailNotification(Boolean registrantsEmailNotification) {
    this.registrantsEmailNotification = registrantsEmailNotification;
  }

  public ResponseCreateMeetingSettings registrantsConfirmationEmail(Boolean registrantsConfirmationEmail) {
    this.registrantsConfirmationEmail = registrantsConfirmationEmail;
    return this;
  }

  /**
   * Whether to send registrants an email confirmation: * &#x60;true&#x60; — Send a confirmation
   * email. * &#x60;false&#x60; — Do not send a confirmation email.
   * 
   * @return registrantsConfirmationEmail
   **/
  @Schema(description = "Whether to send registrants an email confirmation: * `true` — Send a confirmation email. * `false` — Do not send a confirmation email.")
  public Boolean isRegistrantsConfirmationEmail() {
    return registrantsConfirmationEmail;
  }

  public void setRegistrantsConfirmationEmail(Boolean registrantsConfirmationEmail) {
    this.registrantsConfirmationEmail = registrantsConfirmationEmail;
  }

  public ResponseCreateMeetingSettings meetingAuthentication(Boolean meetingAuthentication) {
    this.meetingAuthentication = meetingAuthentication;
    return this;
  }

  /**
   * &#x60;true&#x60;- Only authenticated users can join meetings.
   * 
   * @return meetingAuthentication
   **/
  @Schema(description = "`true`- Only authenticated users can join meetings.")
  public Boolean isMeetingAuthentication() {
    return meetingAuthentication;
  }

  public void setMeetingAuthentication(Boolean meetingAuthentication) {
    this.meetingAuthentication = meetingAuthentication;
  }

  public ResponseCreateMeetingSettings authenticationOption(String authenticationOption) {
    this.authenticationOption = authenticationOption;
    return this;
  }

  /**
   * Meeting authentication option id.
   * 
   * @return authenticationOption
   **/
  @Schema(description = "Meeting authentication option id.")
  public String getAuthenticationOption() {
    return authenticationOption;
  }

  public void setAuthenticationOption(String authenticationOption) {
    this.authenticationOption = authenticationOption;
  }

  public ResponseCreateMeetingSettings authenticationDomains(String authenticationDomains) {
    this.authenticationDomains = authenticationDomains;
    return this;
  }

  /**
   * If user has configured [\&quot;Sign Into Zoom with Specified
   * Domains\&quot;](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f)
   * option, this will list the domains that are authenticated.
   * 
   * @return authenticationDomains
   **/
  @Schema(description = "If user has configured [\"Sign Into Zoom with Specified Domains\"](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f) option, this will list the domains that are authenticated.")
  public String getAuthenticationDomains() {
    return authenticationDomains;
  }

  public void setAuthenticationDomains(String authenticationDomains) {
    this.authenticationDomains = authenticationDomains;
  }

  public ResponseCreateMeetingSettings authenticationName(String authenticationName) {
    this.authenticationName = authenticationName;
    return this;
  }

  /**
   * Authentication name set in the [authentication
   * profile](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f).
   * 
   * @return authenticationName
   **/
  @Schema(description = "Authentication name set in the [authentication profile](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars#h_5c0df2e1-cfd2-469f-bb4a-c77d7c0cca6f).")
  public String getAuthenticationName() {
    return authenticationName;
  }

  public void setAuthenticationName(String authenticationName) {
    this.authenticationName = authenticationName;
  }

  public ResponseCreateMeetingSettings showShareButton(Boolean showShareButton) {
    this.showShareButton = showShareButton;
    return this;
  }

  /**
   * Show social share buttons on the meeting registration page. This setting only works for meetings
   * that require
   * [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting).
   * 
   * @return showShareButton
   **/
  @Schema(description = "Show social share buttons on the meeting registration page. This setting only works for meetings that require [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting).")
  public Boolean isShowShareButton() {
    return showShareButton;
  }

  public void setShowShareButton(Boolean showShareButton) {
    this.showShareButton = showShareButton;
  }

  public ResponseCreateMeetingSettings allowMultipleDevices(Boolean allowMultipleDevices) {
    this.allowMultipleDevices = allowMultipleDevices;
    return this;
  }

  /**
   * Allow attendees to join the meeting from multiple devices. This setting only works for meetings
   * that require
   * [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting).
   * 
   * @return allowMultipleDevices
   **/
  @Schema(description = "Allow attendees to join the meeting from multiple devices. This setting only works for meetings that require [registration](https://support.zoom.us/hc/en-us/articles/211579443-Setting-up-registration-for-a-meeting).")
  public Boolean isAllowMultipleDevices() {
    return allowMultipleDevices;
  }

  public void setAllowMultipleDevices(Boolean allowMultipleDevices) {
    this.allowMultipleDevices = allowMultipleDevices;
  }

  public ResponseCreateMeetingSettings encryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * Choose between enhanced encryption and [end-to-end
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871) when starting or a meeting.
   * When using end-to-end encryption, several features (e.g. cloud recording, phone/SIP/H.323
   * dial-in) will be **automatically disabled**. &lt;br&gt;&lt;br&gt;The value of this field can be
   * one of the following:&lt;br&gt; &#x60;enhanced_encryption&#x60;: Enhanced encryption. Encryption
   * is stored in the cloud if you enable this option. &lt;br&gt; &#x60;e2ee&#x60;: [End-to-end
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871). The encryption key is stored
   * in your local device and can not be obtained by anyone else. Enabling this setting also
   * **disables** the following features: join before host, cloud recording, streaming, live
   * transcription, breakout rooms, polling, 1:1 private chat, and meeting reactions.
   * 
   * @return encryptionType
   **/
  @Schema(description = "Choose between enhanced encryption and [end-to-end encryption](https://support.zoom.us/hc/en-us/articles/360048660871) when starting or a meeting. When using end-to-end encryption, several features (e.g. cloud recording, phone/SIP/H.323 dial-in) will be **automatically disabled**. <br><br>The value of this field can be one of the following:<br> `enhanced_encryption`: Enhanced encryption. Encryption is stored in the cloud if you enable this option. <br>  `e2ee`: [End-to-end encryption](https://support.zoom.us/hc/en-us/articles/360048660871). The encryption key is stored in your local device and can not be obtained by anyone else. Enabling this setting also **disables** the following features: join before host, cloud recording, streaming, live transcription, breakout rooms, polling, 1:1 private chat, and meeting reactions.")
  public EncryptionTypeEnum getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
  }

  public ResponseCreateMeetingSettings approvedOrDeniedCountriesOrRegions(ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions) {
    this.approvedOrDeniedCountriesOrRegions = approvedOrDeniedCountriesOrRegions;
    return this;
  }

  /**
   * Get approvedOrDeniedCountriesOrRegions
   * 
   * @return approvedOrDeniedCountriesOrRegions
   **/
  @Schema(description = "")
  public ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions getApprovedOrDeniedCountriesOrRegions() {
    return approvedOrDeniedCountriesOrRegions;
  }

  public void setApprovedOrDeniedCountriesOrRegions(ResponseCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions) {
    this.approvedOrDeniedCountriesOrRegions = approvedOrDeniedCountriesOrRegions;
  }

  public ResponseCreateMeetingSettings authenticationException(List<ResponseCreateMeetingSettingsAuthenticationException> authenticationException) {
    this.authenticationException = authenticationException;
    return this;
  }

  public ResponseCreateMeetingSettings addAuthenticationExceptionItem(ResponseCreateMeetingSettingsAuthenticationException authenticationExceptionItem) {
    if (this.authenticationException == null) {
      this.authenticationException = new ArrayList<ResponseCreateMeetingSettingsAuthenticationException>();
    }
    this.authenticationException.add(authenticationExceptionItem);
    return this;
  }

  /**
   * The participants added here will receive unique meeting invite links and bypass authentication.
   * 
   * @return authenticationException
   **/
  @Schema(description = "The participants added here will receive unique meeting invite links and bypass authentication.")
  public List<ResponseCreateMeetingSettingsAuthenticationException> getAuthenticationException() {
    return authenticationException;
  }

  public void setAuthenticationException(List<ResponseCreateMeetingSettingsAuthenticationException> authenticationException) {
    this.authenticationException = authenticationException;
  }

  public ResponseCreateMeetingSettings breakoutRoom(ResponseCreateMeetingSettingsBreakoutRoom breakoutRoom) {
    this.breakoutRoom = breakoutRoom;
    return this;
  }

  /**
   * Get breakoutRoom
   * 
   * @return breakoutRoom
   **/
  @Schema(description = "")
  public ResponseCreateMeetingSettingsBreakoutRoom getBreakoutRoom() {
    return breakoutRoom;
  }

  public void setBreakoutRoom(ResponseCreateMeetingSettingsBreakoutRoom breakoutRoom) {
    this.breakoutRoom = breakoutRoom;
  }

  public ResponseCreateMeetingSettings languageInterpretation(ResponseCreateMeetingSettingsLanguageInterpretation languageInterpretation) {
    this.languageInterpretation = languageInterpretation;
    return this;
  }

  /**
   * Get languageInterpretation
   * 
   * @return languageInterpretation
   **/
  @Schema(description = "")
  public ResponseCreateMeetingSettingsLanguageInterpretation getLanguageInterpretation() {
    return languageInterpretation;
  }

  public void setLanguageInterpretation(ResponseCreateMeetingSettingsLanguageInterpretation languageInterpretation) {
    this.languageInterpretation = languageInterpretation;
  }

  public ResponseCreateMeetingSettings customKeys(List<ResponseCreateMeetingSettingsCustomKeys> customKeys) {
    this.customKeys = customKeys;
    return this;
  }

  public ResponseCreateMeetingSettings addCustomKeysItem(ResponseCreateMeetingSettingsCustomKeys customKeysItem) {
    if (this.customKeys == null) {
      this.customKeys = new ArrayList<ResponseCreateMeetingSettingsCustomKeys>();
    }
    this.customKeys.add(customKeysItem);
    return this;
  }

  /**
   * Custom keys and values assigned to the meeting.
   * 
   * @return customKeys
   **/
  @Schema(description = "Custom keys and values assigned to the meeting.")
  public List<ResponseCreateMeetingSettingsCustomKeys> getCustomKeys() {
    return customKeys;
  }

  public void setCustomKeys(List<ResponseCreateMeetingSettingsCustomKeys> customKeys) {
    this.customKeys = customKeys;
  }

  public ResponseCreateMeetingSettings alternativeHostsEmailNotification(Boolean alternativeHostsEmailNotification) {
    this.alternativeHostsEmailNotification = alternativeHostsEmailNotification;
    return this;
  }

  /**
   * Flag to determine whether to send email notifications to alternative hosts, default value is
   * true.
   * 
   * @return alternativeHostsEmailNotification
   **/
  @Schema(description = "Flag to determine whether to send email notifications to alternative hosts, default value is true.")
  public Boolean isAlternativeHostsEmailNotification() {
    return alternativeHostsEmailNotification;
  }

  public void setAlternativeHostsEmailNotification(Boolean alternativeHostsEmailNotification) {
    this.alternativeHostsEmailNotification = alternativeHostsEmailNotification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCreateMeetingSettings responseCreateMeetingSettings = (ResponseCreateMeetingSettings) o;
    return Objects.equals(this.hostVideo, responseCreateMeetingSettings.hostVideo) &&
        Objects.equals(this.participantVideo, responseCreateMeetingSettings.participantVideo) &&
        Objects.equals(this.cnMeeting, responseCreateMeetingSettings.cnMeeting) &&
        Objects.equals(this.inMeeting, responseCreateMeetingSettings.inMeeting) &&
        Objects.equals(this.joinBeforeHost, responseCreateMeetingSettings.joinBeforeHost) &&
        Objects.equals(this.jbhTime, responseCreateMeetingSettings.jbhTime) &&
        Objects.equals(this.muteUponEntry, responseCreateMeetingSettings.muteUponEntry) &&
        Objects.equals(this.watermark, responseCreateMeetingSettings.watermark) &&
        Objects.equals(this.usePmi, responseCreateMeetingSettings.usePmi) &&
        Objects.equals(this.approvalType, responseCreateMeetingSettings.approvalType) &&
        Objects.equals(this.registrationType, responseCreateMeetingSettings.registrationType) &&
        Objects.equals(this.audio, responseCreateMeetingSettings.audio) &&
        Objects.equals(this.autoRecording, responseCreateMeetingSettings.autoRecording) &&
        Objects.equals(this.enforceLogin, responseCreateMeetingSettings.enforceLogin) &&
        Objects.equals(this.enforceLoginDomains, responseCreateMeetingSettings.enforceLoginDomains) &&
        Objects.equals(this.alternativeHosts, responseCreateMeetingSettings.alternativeHosts) &&
        Objects.equals(this.closeRegistration, responseCreateMeetingSettings.closeRegistration) &&
        Objects.equals(this.waitingRoom, responseCreateMeetingSettings.waitingRoom) &&
        Objects.equals(this.globalDialInCountries, responseCreateMeetingSettings.globalDialInCountries) &&
        Objects.equals(this.globalDialInNumbers, responseCreateMeetingSettings.globalDialInNumbers) &&
        Objects.equals(this.contactName, responseCreateMeetingSettings.contactName) &&
        Objects.equals(this.contactEmail, responseCreateMeetingSettings.contactEmail) &&
        Objects.equals(this.registrantsEmailNotification, responseCreateMeetingSettings.registrantsEmailNotification) &&
        Objects.equals(this.registrantsConfirmationEmail, responseCreateMeetingSettings.registrantsConfirmationEmail) &&
        Objects.equals(this.meetingAuthentication, responseCreateMeetingSettings.meetingAuthentication) &&
        Objects.equals(this.authenticationOption, responseCreateMeetingSettings.authenticationOption) &&
        Objects.equals(this.authenticationDomains, responseCreateMeetingSettings.authenticationDomains) &&
        Objects.equals(this.authenticationName, responseCreateMeetingSettings.authenticationName) &&
        Objects.equals(this.showShareButton, responseCreateMeetingSettings.showShareButton) &&
        Objects.equals(this.allowMultipleDevices, responseCreateMeetingSettings.allowMultipleDevices) &&
        Objects.equals(this.encryptionType, responseCreateMeetingSettings.encryptionType) &&
        Objects.equals(this.approvedOrDeniedCountriesOrRegions, responseCreateMeetingSettings.approvedOrDeniedCountriesOrRegions) &&
        Objects.equals(this.authenticationException, responseCreateMeetingSettings.authenticationException) &&
        Objects.equals(this.breakoutRoom, responseCreateMeetingSettings.breakoutRoom) &&
        Objects.equals(this.languageInterpretation, responseCreateMeetingSettings.languageInterpretation) &&
        Objects.equals(this.customKeys, responseCreateMeetingSettings.customKeys) &&
        Objects.equals(this.alternativeHostsEmailNotification, responseCreateMeetingSettings.alternativeHostsEmailNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostVideo, participantVideo, cnMeeting, inMeeting, joinBeforeHost, jbhTime, muteUponEntry, watermark, usePmi, approvalType, registrationType, audio, autoRecording, enforceLogin, enforceLoginDomains, alternativeHosts, closeRegistration, waitingRoom, globalDialInCountries, globalDialInNumbers, contactName, contactEmail, registrantsEmailNotification, registrantsConfirmationEmail, meetingAuthentication, authenticationOption, authenticationDomains, authenticationName, showShareButton, allowMultipleDevices, encryptionType, approvedOrDeniedCountriesOrRegions, authenticationException, breakoutRoom, languageInterpretation, customKeys, alternativeHostsEmailNotification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCreateMeetingSettings {\n");

    sb.append("    hostVideo: ").append(toIndentedString(hostVideo)).append("\n");
    sb.append("    participantVideo: ").append(toIndentedString(participantVideo)).append("\n");
    sb.append("    cnMeeting: ").append(toIndentedString(cnMeeting)).append("\n");
    sb.append("    inMeeting: ").append(toIndentedString(inMeeting)).append("\n");
    sb.append("    joinBeforeHost: ").append(toIndentedString(joinBeforeHost)).append("\n");
    sb.append("    jbhTime: ").append(toIndentedString(jbhTime)).append("\n");
    sb.append("    muteUponEntry: ").append(toIndentedString(muteUponEntry)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    usePmi: ").append(toIndentedString(usePmi)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    autoRecording: ").append(toIndentedString(autoRecording)).append("\n");
    sb.append("    enforceLogin: ").append(toIndentedString(enforceLogin)).append("\n");
    sb.append("    enforceLoginDomains: ").append(toIndentedString(enforceLoginDomains)).append("\n");
    sb.append("    alternativeHosts: ").append(toIndentedString(alternativeHosts)).append("\n");
    sb.append("    closeRegistration: ").append(toIndentedString(closeRegistration)).append("\n");
    sb.append("    waitingRoom: ").append(toIndentedString(waitingRoom)).append("\n");
    sb.append("    globalDialInCountries: ").append(toIndentedString(globalDialInCountries)).append("\n");
    sb.append("    globalDialInNumbers: ").append(toIndentedString(globalDialInNumbers)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    registrantsEmailNotification: ").append(toIndentedString(registrantsEmailNotification)).append("\n");
    sb.append("    registrantsConfirmationEmail: ").append(toIndentedString(registrantsConfirmationEmail)).append("\n");
    sb.append("    meetingAuthentication: ").append(toIndentedString(meetingAuthentication)).append("\n");
    sb.append("    authenticationOption: ").append(toIndentedString(authenticationOption)).append("\n");
    sb.append("    authenticationDomains: ").append(toIndentedString(authenticationDomains)).append("\n");
    sb.append("    authenticationName: ").append(toIndentedString(authenticationName)).append("\n");
    sb.append("    showShareButton: ").append(toIndentedString(showShareButton)).append("\n");
    sb.append("    allowMultipleDevices: ").append(toIndentedString(allowMultipleDevices)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    approvedOrDeniedCountriesOrRegions: ").append(toIndentedString(approvedOrDeniedCountriesOrRegions)).append("\n");
    sb.append("    authenticationException: ").append(toIndentedString(authenticationException)).append("\n");
    sb.append("    breakoutRoom: ").append(toIndentedString(breakoutRoom)).append("\n");
    sb.append("    languageInterpretation: ").append(toIndentedString(languageInterpretation)).append("\n");
    sb.append("    customKeys: ").append(toIndentedString(customKeys)).append("\n");
    sb.append("    alternativeHostsEmailNotification: ").append(toIndentedString(alternativeHostsEmailNotification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
