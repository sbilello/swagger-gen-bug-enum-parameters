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
 * Information about the meeting&#x27;s settings.
 */
@Schema(description = "Information about the meeting's settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-14T19:47:53.683812-07:00[America/Los_Angeles]")
public class RequestCreateMeetingSettings {
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
   * If the value of the &#x60;join_before_host&#x60; field is &#x60;true&#x60;, this field indicates
   * the time limits within which a participant can join a meeting before the meeting&#x27;s host: *
   * &#x60;0&#x60; — Allow the participant to join the meeting at anytime. * &#x60;5&#x60; — Allow the
   * participant to join 5 minutes before the meeting&#x27;s start time. * &#x60;10&#x60; — Allow the
   * participant to join 10 minutes before the meeting&#x27;s start time.
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
   * Enable meeting registration approval: * &#x60;0&#x60; — Automatically approve registration. *
   * &#x60;1&#x60; — Manually approve registration. * &#x60;2&#x60; — No registration required. This
   * value defaults to &#x60;2&#x60;.
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
   * The meeting&#x27;s registration type: * &#x60;1&#x60; — Attendees register once and can attend
   * any meeting occurrence. * &#x60;2&#x60; — Attendees must register for each meeting occurrence. *
   * &#x60;3&#x60; — Attendees register once and can select one or more meeting occurrences to attend.
   * This field is only for recurring meetings with fixed times (&#x60;8&#x60;). This value defaults
   * to &#x60;1&#x60;.
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
   * How participants join the audio portion of the meeting: * &#x60;both&#x60; — Both telephony and
   * VoIP. * &#x60;telephony&#x60; — Telephony only. * &#x60;voip&#x60; — VoIP only. This value
   * defaults to &#x60;both&#x60;.
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
   * The automatic recording settings: * &#x60;local&#x60; — Record the meeting locally. *
   * &#x60;cloud&#x60; — Record the meeting to the cloud. * &#x60;none&#x60; — Auto-recording
   * disabled. This value defaults to &#x60;none&#x60;.
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

  @JsonProperty("alternative_hosts")
  private String alternativeHosts = null;

  @JsonProperty("close_registration")
  private Boolean closeRegistration = false;

  @JsonProperty("waiting_room")
  private Boolean waitingRoom = null;

  @JsonProperty("global_dial_in_countries")
  private List<String> globalDialInCountries = null;

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

  @JsonProperty("authentication_exception")
  private List<RequestCreateMeetingSettingsAuthenticationException> authenticationException = null;

  @JsonProperty("additional_data_center_regions")
  private List<String> additionalDataCenterRegions = null;

  @JsonProperty("breakout_room")
  private RequestCreateMeetingSettingsBreakoutRoom breakoutRoom = null;

  @JsonProperty("language_interpretation")
  private RequestCreateMeetingSettingsLanguageInterpretation languageInterpretation = null;

  @JsonProperty("show_share_button")
  private Boolean showShareButton = null;

  @JsonProperty("allow_multiple_devices")
  private Boolean allowMultipleDevices = null;

  /**
   * The type of [end-to-end (E2EE)
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871) to use for the meeting: *
   * &#x60;enhanced_encryption&#x60; — Enhanced encryption. Encryption is stored in the cloud when you
   * enable this option. * &#x60;e2ee&#x60; — End-to-end encryption. The encryption key is stored on
   * your local device and **cannot** be obtained by anyone else. When you use E2EE encryption,
   * [certain features](https://support.zoom.us/hc/en-us/articles/360048660871), such as cloud
   * recording or phone and SIP/H.323 dial-in, are **disabled**.
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
  private RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions = null;

  @JsonProperty("alternative_hosts_email_notification")
  private Boolean alternativeHostsEmailNotification = true;

  public RequestCreateMeetingSettings hostVideo(Boolean hostVideo) {
    this.hostVideo = hostVideo;
    return this;
  }

  /**
   * Whether to start meetings with the host video on.
   * 
   * @return hostVideo
   **/
  @Schema(description = "Whether to start meetings with the host video on.")
  public Boolean isHostVideo() {
    return hostVideo;
  }

  public void setHostVideo(Boolean hostVideo) {
    this.hostVideo = hostVideo;
  }

  public RequestCreateMeetingSettings participantVideo(Boolean participantVideo) {
    this.participantVideo = participantVideo;
    return this;
  }

  /**
   * Whether to start meetings with the participant video on.
   * 
   * @return participantVideo
   **/
  @Schema(description = "Whether to start meetings with the participant video on.")
  public Boolean isParticipantVideo() {
    return participantVideo;
  }

  public void setParticipantVideo(Boolean participantVideo) {
    this.participantVideo = participantVideo;
  }

  public RequestCreateMeetingSettings cnMeeting(Boolean cnMeeting) {
    this.cnMeeting = cnMeeting;
    return this;
  }

  /**
   * Whether to host the meeting in China (CN). This value defaults to &#x60;false&#x60;.
   * 
   * @return cnMeeting
   **/
  @Schema(description = "Whether to host the meeting in China (CN). This value defaults to `false`.")
  public Boolean isCnMeeting() {
    return cnMeeting;
  }

  public void setCnMeeting(Boolean cnMeeting) {
    this.cnMeeting = cnMeeting;
  }

  public RequestCreateMeetingSettings inMeeting(Boolean inMeeting) {
    this.inMeeting = inMeeting;
    return this;
  }

  /**
   * Whether to host the meeting in India (IN). This value defaults to &#x60;false&#x60;.
   * 
   * @return inMeeting
   **/
  @Schema(description = "Whether to host the meeting in India (IN). This value defaults to `false`.")
  public Boolean isInMeeting() {
    return inMeeting;
  }

  public void setInMeeting(Boolean inMeeting) {
    this.inMeeting = inMeeting;
  }

  public RequestCreateMeetingSettings joinBeforeHost(Boolean joinBeforeHost) {
    this.joinBeforeHost = joinBeforeHost;
    return this;
  }

  /**
   * Whether participants can join the meeting before its host. This field is only used for scheduled
   * meetings (&#x60;2&#x60;) or recurring meetings (&#x60;3&#x60; and &#x60;8&#x60;). This value
   * defaults to &#x60;false&#x60;. If the [**Waiting Room**
   * feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room) is enabled, this
   * setting is **disabled**.
   * 
   * @return joinBeforeHost
   **/
  @Schema(description = "Whether participants can join the meeting before its host. This field is only used for scheduled meetings (`2`) or recurring meetings (`3` and `8`). This value defaults to `false`.  If the [**Waiting Room** feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room) is enabled, this setting is **disabled**.")
  public Boolean isJoinBeforeHost() {
    return joinBeforeHost;
  }

  public void setJoinBeforeHost(Boolean joinBeforeHost) {
    this.joinBeforeHost = joinBeforeHost;
  }

  public RequestCreateMeetingSettings jbhTime(JbhTimeEnum jbhTime) {
    this.jbhTime = jbhTime;
    return this;
  }

  /**
   * If the value of the &#x60;join_before_host&#x60; field is &#x60;true&#x60;, this field indicates
   * the time limits within which a participant can join a meeting before the meeting&#x27;s host: *
   * &#x60;0&#x60; — Allow the participant to join the meeting at anytime. * &#x60;5&#x60; — Allow the
   * participant to join 5 minutes before the meeting&#x27;s start time. * &#x60;10&#x60; — Allow the
   * participant to join 10 minutes before the meeting&#x27;s start time.
   * 
   * @return jbhTime
   **/
  @Schema(description = "If the value of the `join_before_host` field is `true`, this field indicates the time limits within which a participant can join a meeting before the meeting's host:  * `0` — Allow the participant to join the meeting at anytime. * `5` — Allow the participant to join 5 minutes before the meeting's start time. * `10` — Allow the participant to join 10 minutes before the meeting's start time.")
  public JbhTimeEnum getJbhTime() {
    return jbhTime;
  }

  public void setJbhTime(JbhTimeEnum jbhTime) {
    this.jbhTime = jbhTime;
  }

  public RequestCreateMeetingSettings muteUponEntry(Boolean muteUponEntry) {
    this.muteUponEntry = muteUponEntry;
    return this;
  }

  /**
   * Whether to mute participants upon entry.
   * 
   * @return muteUponEntry
   **/
  @Schema(description = "Whether to mute participants upon entry.")
  public Boolean isMuteUponEntry() {
    return muteUponEntry;
  }

  public void setMuteUponEntry(Boolean muteUponEntry) {
    this.muteUponEntry = muteUponEntry;
  }

  public RequestCreateMeetingSettings watermark(Boolean watermark) {
    this.watermark = watermark;
    return this;
  }

  /**
   * Whether to add a watermark when viewing a shared screen.
   * 
   * @return watermark
   **/
  @Schema(description = "Whether to add a watermark when viewing a shared screen.")
  public Boolean isWatermark() {
    return watermark;
  }

  public void setWatermark(Boolean watermark) {
    this.watermark = watermark;
  }

  public RequestCreateMeetingSettings usePmi(Boolean usePmi) {
    this.usePmi = usePmi;
    return this;
  }

  /**
   * Whether to use a [PMI (Personal Meeting
   * ID)](https://support.zoom.us/hc/en-us/articles/203276937-Using-Personal-Meeting-ID-PMI-) instead
   * of a generated meeting ID. This field is only used for scheduled meetings (&#x60;2&#x60;),
   * instant meetings (&#x60;1&#x60;), or recurring meetings with no fixed time (&#x60;3&#x60;). This
   * value defaults to &#x60;false&#x60;.
   * 
   * @return usePmi
   **/
  @Schema(description = "Whether to use a [PMI (Personal Meeting ID)](https://support.zoom.us/hc/en-us/articles/203276937-Using-Personal-Meeting-ID-PMI-) instead of a generated meeting ID. This field is only used for scheduled meetings (`2`), instant meetings (`1`), or recurring meetings with no fixed time (`3`). This value defaults to `false`.")
  public Boolean isUsePmi() {
    return usePmi;
  }

  public void setUsePmi(Boolean usePmi) {
    this.usePmi = usePmi;
  }

  public RequestCreateMeetingSettings approvalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
    return this;
  }

  /**
   * Enable meeting registration approval: * &#x60;0&#x60; — Automatically approve registration. *
   * &#x60;1&#x60; — Manually approve registration. * &#x60;2&#x60; — No registration required. This
   * value defaults to &#x60;2&#x60;.
   * 
   * @return approvalType
   **/
  @Schema(description = "Enable meeting registration approval: * `0` — Automatically approve registration. * `1` — Manually approve registration. * `2` — No registration required.  This value defaults to `2`.")
  public ApprovalTypeEnum getApprovalType() {
    return approvalType;
  }

  public void setApprovalType(ApprovalTypeEnum approvalType) {
    this.approvalType = approvalType;
  }

  public RequestCreateMeetingSettings registrationType(RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
    return this;
  }

  /**
   * The meeting&#x27;s registration type: * &#x60;1&#x60; — Attendees register once and can attend
   * any meeting occurrence. * &#x60;2&#x60; — Attendees must register for each meeting occurrence. *
   * &#x60;3&#x60; — Attendees register once and can select one or more meeting occurrences to attend.
   * This field is only for recurring meetings with fixed times (&#x60;8&#x60;). This value defaults
   * to &#x60;1&#x60;.
   * 
   * @return registrationType
   **/
  @Schema(description = "The meeting's registration type: * `1` — Attendees register once and can attend any meeting occurrence. * `2` — Attendees must register for each meeting occurrence. * `3` — Attendees register once and can select one or more meeting occurrences to attend.  This field is only for recurring meetings with fixed times (`8`). This value defaults to `1`.")
  public RegistrationTypeEnum getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(RegistrationTypeEnum registrationType) {
    this.registrationType = registrationType;
  }

  public RequestCreateMeetingSettings audio(AudioEnum audio) {
    this.audio = audio;
    return this;
  }

  /**
   * How participants join the audio portion of the meeting: * &#x60;both&#x60; — Both telephony and
   * VoIP. * &#x60;telephony&#x60; — Telephony only. * &#x60;voip&#x60; — VoIP only. This value
   * defaults to &#x60;both&#x60;.
   * 
   * @return audio
   **/
  @Schema(description = "How participants join the audio portion of the meeting: * `both` — Both telephony and VoIP. * `telephony` — Telephony only. * `voip` — VoIP only.  This value defaults to `both`.")
  public AudioEnum getAudio() {
    return audio;
  }

  public void setAudio(AudioEnum audio) {
    this.audio = audio;
  }

  public RequestCreateMeetingSettings autoRecording(AutoRecordingEnum autoRecording) {
    this.autoRecording = autoRecording;
    return this;
  }

  /**
   * The automatic recording settings: * &#x60;local&#x60; — Record the meeting locally. *
   * &#x60;cloud&#x60; — Record the meeting to the cloud. * &#x60;none&#x60; — Auto-recording
   * disabled. This value defaults to &#x60;none&#x60;.
   * 
   * @return autoRecording
   **/
  @Schema(description = "The automatic recording settings: * `local` — Record the meeting locally. * `cloud` — Record the meeting to the cloud. * `none` — Auto-recording disabled.  This value defaults to `none`.")
  public AutoRecordingEnum getAutoRecording() {
    return autoRecording;
  }

  public void setAutoRecording(AutoRecordingEnum autoRecording) {
    this.autoRecording = autoRecording;
  }

  public RequestCreateMeetingSettings alternativeHosts(String alternativeHosts) {
    this.alternativeHosts = alternativeHosts;
    return this;
  }

  /**
   * The alternative hosts&#x27; email addresses or IDs. Comma-separate multiple values.
   * 
   * @return alternativeHosts
   **/
  @Schema(description = "The alternative hosts' email addresses or IDs. Comma-separate multiple values.")
  public String getAlternativeHosts() {
    return alternativeHosts;
  }

  public void setAlternativeHosts(String alternativeHosts) {
    this.alternativeHosts = alternativeHosts;
  }

  public RequestCreateMeetingSettings closeRegistration(Boolean closeRegistration) {
    this.closeRegistration = closeRegistration;
    return this;
  }

  /**
   * Whether to close registration after the event date. This value defaults to &#x60;false&#x60;.
   * 
   * @return closeRegistration
   **/
  @Schema(description = "Whether to close registration after the event date. This value defaults to `false`.")
  public Boolean isCloseRegistration() {
    return closeRegistration;
  }

  public void setCloseRegistration(Boolean closeRegistration) {
    this.closeRegistration = closeRegistration;
  }

  public RequestCreateMeetingSettings waitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
    return this;
  }

  /**
   * Whether to enable the [**Waiting Room**
   * feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room). If this value is
   * &#x60;true&#x60;, this **disables** the &#x60;join_before_host&#x60; setting.
   * 
   * @return waitingRoom
   **/
  @Schema(description = "Whether to enable the [**Waiting Room** feature](https://support.zoom.us/hc/en-us/articles/115000332726-Waiting-Room). If this value is `true`, this **disables** the `join_before_host` setting.")
  public Boolean isWaitingRoom() {
    return waitingRoom;
  }

  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }

  public RequestCreateMeetingSettings globalDialInCountries(List<String> globalDialInCountries) {
    this.globalDialInCountries = globalDialInCountries;
    return this;
  }

  public RequestCreateMeetingSettings addGlobalDialInCountriesItem(String globalDialInCountriesItem) {
    if (this.globalDialInCountries == null) {
      this.globalDialInCountries = new ArrayList<String>();
    }
    this.globalDialInCountries.add(globalDialInCountriesItem);
    return this;
  }

  /**
   * A list of available global dial-in countries.
   * 
   * @return globalDialInCountries
   **/
  @Schema(description = "A list of available global dial-in countries.")
  public List<String> getGlobalDialInCountries() {
    return globalDialInCountries;
  }

  public void setGlobalDialInCountries(List<String> globalDialInCountries) {
    this.globalDialInCountries = globalDialInCountries;
  }

  public RequestCreateMeetingSettings contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * The contact name for meeting registration.
   * 
   * @return contactName
   **/
  @Schema(description = "The contact name for meeting registration.")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public RequestCreateMeetingSettings contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * The contact email address for meeting registration.
   * 
   * @return contactEmail
   **/
  @Schema(description = "The contact email address for meeting registration.")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public RequestCreateMeetingSettings registrantsEmailNotification(Boolean registrantsEmailNotification) {
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

  public RequestCreateMeetingSettings registrantsConfirmationEmail(Boolean registrantsConfirmationEmail) {
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

  public RequestCreateMeetingSettings meetingAuthentication(Boolean meetingAuthentication) {
    this.meetingAuthentication = meetingAuthentication;
    return this;
  }

  /**
   * If true, only
   * [authenticated](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars)
   * users can join the meeting.
   * 
   * @return meetingAuthentication
   **/
  @Schema(description = "If true, only [authenticated](https://support.zoom.us/hc/en-us/articles/360037117472-Authentication-Profiles-for-Meetings-and-Webinars) users can join the meeting.")
  public Boolean isMeetingAuthentication() {
    return meetingAuthentication;
  }

  public void setMeetingAuthentication(Boolean meetingAuthentication) {
    this.meetingAuthentication = meetingAuthentication;
  }

  public RequestCreateMeetingSettings authenticationOption(String authenticationOption) {
    this.authenticationOption = authenticationOption;
    return this;
  }

  /**
   * If the &#x60;meeting_authentication&#x60; value is &#x60;true&#x60;, the type of authentication
   * required for users to join a meeting. To get this value, use the
   * &#x60;authentication_options&#x60; array&#x27;s &#x60;id&#x60; value in the [**Get User
   * Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/users/usersettings) API
   * response.
   * 
   * @return authenticationOption
   **/
  @Schema(description = "If the `meeting_authentication` value is `true`, the type of authentication required for users to join a meeting.  To get this value, use the `authentication_options` array's `id` value in the [**Get User Settings**](https://marketplace.zoom.us/docs/api-reference/zoom-api/users/usersettings) API response.")
  public String getAuthenticationOption() {
    return authenticationOption;
  }

  public void setAuthenticationOption(String authenticationOption) {
    this.authenticationOption = authenticationOption;
  }

  public RequestCreateMeetingSettings authenticationDomains(String authenticationDomains) {
    this.authenticationDomains = authenticationDomains;
    return this;
  }

  /**
   * The meeting&#x27;s authenticated domains. Only Zoom users whose email address contains an
   * authenticated domain can join the meeting. Comma-separate multiple domains or use a wildcard for
   * listing domains.
   * 
   * @return authenticationDomains
   **/
  @Schema(description = "The meeting's authenticated domains. Only Zoom users whose email address contains an authenticated domain can join the meeting. Comma-separate multiple domains or use a wildcard for listing domains.")
  public String getAuthenticationDomains() {
    return authenticationDomains;
  }

  public void setAuthenticationDomains(String authenticationDomains) {
    this.authenticationDomains = authenticationDomains;
  }

  public RequestCreateMeetingSettings authenticationException(List<RequestCreateMeetingSettingsAuthenticationException> authenticationException) {
    this.authenticationException = authenticationException;
    return this;
  }

  public RequestCreateMeetingSettings addAuthenticationExceptionItem(RequestCreateMeetingSettingsAuthenticationException authenticationExceptionItem) {
    if (this.authenticationException == null) {
      this.authenticationException = new ArrayList<RequestCreateMeetingSettingsAuthenticationException>();
    }
    this.authenticationException.add(authenticationExceptionItem);
    return this;
  }

  /**
   * A list of participants that can bypass meeting authentication. These participants will receive a
   * unique meeting invite.
   * 
   * @return authenticationException
   **/
  @Schema(description = "A list of participants that can bypass meeting authentication. These participants will receive a unique meeting invite.")
  public List<RequestCreateMeetingSettingsAuthenticationException> getAuthenticationException() {
    return authenticationException;
  }

  public void setAuthenticationException(List<RequestCreateMeetingSettingsAuthenticationException> authenticationException) {
    this.authenticationException = authenticationException;
  }

  public RequestCreateMeetingSettings additionalDataCenterRegions(List<String> additionalDataCenterRegions) {
    this.additionalDataCenterRegions = additionalDataCenterRegions;
    return this;
  }

  public RequestCreateMeetingSettings addAdditionalDataCenterRegionsItem(String additionalDataCenterRegionsItem) {
    if (this.additionalDataCenterRegions == null) {
      this.additionalDataCenterRegions = new ArrayList<String>();
    }
    this.additionalDataCenterRegions.add(additionalDataCenterRegionsItem);
    return this;
  }

  /**
   * Add additional meeting [data center
   * regions](https://support.zoom.us/hc/en-us/articles/360042411451-Selecting-data-center-regions-for-hosted-meetings-and-webinars).
   * Provide this value as an array of [country
   * codes](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries)
   * for the countries available as data center regions in the [**Account
   * Profile**](https://zoom.us/account/setting) interface but have been opted out of in the [user
   * settings](https://zoom.us/profile). For example, the data center regions selected in your
   * [**Account Profile**](https://zoom.us/account) are \&quot;Europe\&quot;, \&quot;Hong Kong
   * SAR\&quot;, \&quot;Australia\&quot;, \&quot;India\&quot;, \&quot;Japan\&quot;,
   * \&quot;China\&quot;, \&quot;United States\&quot;, and \&quot;Canada\&quot;. However, in the [**My
   * Profile**](https://zoom.us/profile) settings, you did **not** select \&quot;India\&quot; and
   * \&quot;Japan\&quot; for meeting and webinar traffic routing. To include \&quot;India\&quot; and
   * \&quot;Japan\&quot; as additional data centers, use the &#x60;[\&quot;IN\&quot;,
   * \&quot;TY\&quot;]&#x60; value for this field.
   * 
   * @return additionalDataCenterRegions
   **/
  @Schema(
      description = "Add additional meeting [data center regions](https://support.zoom.us/hc/en-us/articles/360042411451-Selecting-data-center-regions-for-hosted-meetings-and-webinars). Provide this value as an array of [country codes](https://marketplace.zoom.us/docs/api-reference/other-references/abbreviation-lists#countries) for the countries available as data center regions in the [**Account Profile**](https://zoom.us/account/setting) interface but have been opted out of in the [user settings](https://zoom.us/profile).  For example, the data center regions selected in your [**Account Profile**](https://zoom.us/account) are \"Europe\", \"Hong Kong SAR\", \"Australia\", \"India\", \"Japan\", \"China\", \"United States\", and \"Canada\". However, in the [**My Profile**](https://zoom.us/profile) settings, you did **not** select \"India\" and \"Japan\" for meeting and webinar traffic routing.  To include \"India\" and \"Japan\" as additional data centers, use the `[\"IN\", \"TY\"]` value for this field.")
  public List<String> getAdditionalDataCenterRegions() {
    return additionalDataCenterRegions;
  }

  public void setAdditionalDataCenterRegions(List<String> additionalDataCenterRegions) {
    this.additionalDataCenterRegions = additionalDataCenterRegions;
  }

  public RequestCreateMeetingSettings breakoutRoom(RequestCreateMeetingSettingsBreakoutRoom breakoutRoom) {
    this.breakoutRoom = breakoutRoom;
    return this;
  }

  /**
   * Get breakoutRoom
   * 
   * @return breakoutRoom
   **/
  @Schema(description = "")
  public RequestCreateMeetingSettingsBreakoutRoom getBreakoutRoom() {
    return breakoutRoom;
  }

  public void setBreakoutRoom(RequestCreateMeetingSettingsBreakoutRoom breakoutRoom) {
    this.breakoutRoom = breakoutRoom;
  }

  public RequestCreateMeetingSettings languageInterpretation(RequestCreateMeetingSettingsLanguageInterpretation languageInterpretation) {
    this.languageInterpretation = languageInterpretation;
    return this;
  }

  /**
   * Get languageInterpretation
   * 
   * @return languageInterpretation
   **/
  @Schema(description = "")
  public RequestCreateMeetingSettingsLanguageInterpretation getLanguageInterpretation() {
    return languageInterpretation;
  }

  public void setLanguageInterpretation(RequestCreateMeetingSettingsLanguageInterpretation languageInterpretation) {
    this.languageInterpretation = languageInterpretation;
  }

  public RequestCreateMeetingSettings showShareButton(Boolean showShareButton) {
    this.showShareButton = showShareButton;
    return this;
  }

  /**
   * Whether to include social media sharing butons on the meeting&#x27;s registration page. This
   * setting is only applied to meetings with registration enabled.
   * 
   * @return showShareButton
   **/
  @Schema(description = "Whether to include social media sharing butons on the meeting's registration page. This setting is only applied to meetings with registration enabled.")
  public Boolean isShowShareButton() {
    return showShareButton;
  }

  public void setShowShareButton(Boolean showShareButton) {
    this.showShareButton = showShareButton;
  }

  public RequestCreateMeetingSettings allowMultipleDevices(Boolean allowMultipleDevices) {
    this.allowMultipleDevices = allowMultipleDevices;
    return this;
  }

  /**
   * Whether to allow attendees to join a meeting from multiple devices. This setting is only applied
   * to meetings with registration enabled.
   * 
   * @return allowMultipleDevices
   **/
  @Schema(description = "Whether to allow attendees to join a meeting from multiple devices. This setting is only applied to meetings with registration enabled.")
  public Boolean isAllowMultipleDevices() {
    return allowMultipleDevices;
  }

  public void setAllowMultipleDevices(Boolean allowMultipleDevices) {
    this.allowMultipleDevices = allowMultipleDevices;
  }

  public RequestCreateMeetingSettings encryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * The type of [end-to-end (E2EE)
   * encryption](https://support.zoom.us/hc/en-us/articles/360048660871) to use for the meeting: *
   * &#x60;enhanced_encryption&#x60; — Enhanced encryption. Encryption is stored in the cloud when you
   * enable this option. * &#x60;e2ee&#x60; — End-to-end encryption. The encryption key is stored on
   * your local device and **cannot** be obtained by anyone else. When you use E2EE encryption,
   * [certain features](https://support.zoom.us/hc/en-us/articles/360048660871), such as cloud
   * recording or phone and SIP/H.323 dial-in, are **disabled**.
   * 
   * @return encryptionType
   **/
  @Schema(description = "The type of [end-to-end (E2EE) encryption](https://support.zoom.us/hc/en-us/articles/360048660871) to use for the meeting: * `enhanced_encryption` — Enhanced encryption. Encryption is stored in the cloud when you enable this option. * `e2ee` — End-to-end encryption. The encryption key is stored on your local device and **cannot** be obtained by anyone else. When you use E2EE encryption, [certain features](https://support.zoom.us/hc/en-us/articles/360048660871), such as cloud recording or phone and SIP/H.323 dial-in, are **disabled**.")
  public EncryptionTypeEnum getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(EncryptionTypeEnum encryptionType) {
    this.encryptionType = encryptionType;
  }

  public RequestCreateMeetingSettings approvedOrDeniedCountriesOrRegions(RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions) {
    this.approvedOrDeniedCountriesOrRegions = approvedOrDeniedCountriesOrRegions;
    return this;
  }

  /**
   * Get approvedOrDeniedCountriesOrRegions
   * 
   * @return approvedOrDeniedCountriesOrRegions
   **/
  @Schema(description = "")
  public RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions getApprovedOrDeniedCountriesOrRegions() {
    return approvedOrDeniedCountriesOrRegions;
  }

  public void setApprovedOrDeniedCountriesOrRegions(RequestCreateMeetingSettingsApprovedOrDeniedCountriesOrRegions approvedOrDeniedCountriesOrRegions) {
    this.approvedOrDeniedCountriesOrRegions = approvedOrDeniedCountriesOrRegions;
  }

  public RequestCreateMeetingSettings alternativeHostsEmailNotification(Boolean alternativeHostsEmailNotification) {
    this.alternativeHostsEmailNotification = alternativeHostsEmailNotification;
    return this;
  }

  /**
   * Whether to send email notifications to alternative hosts. This value defaults to
   * &#x60;true&#x60;.
   * 
   * @return alternativeHostsEmailNotification
   **/
  @Schema(description = "Whether to send email notifications to alternative hosts. This value defaults to `true`.")
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
    RequestCreateMeetingSettings requestCreateMeetingSettings = (RequestCreateMeetingSettings) o;
    return Objects.equals(this.hostVideo, requestCreateMeetingSettings.hostVideo) &&
        Objects.equals(this.participantVideo, requestCreateMeetingSettings.participantVideo) &&
        Objects.equals(this.cnMeeting, requestCreateMeetingSettings.cnMeeting) &&
        Objects.equals(this.inMeeting, requestCreateMeetingSettings.inMeeting) &&
        Objects.equals(this.joinBeforeHost, requestCreateMeetingSettings.joinBeforeHost) &&
        Objects.equals(this.jbhTime, requestCreateMeetingSettings.jbhTime) &&
        Objects.equals(this.muteUponEntry, requestCreateMeetingSettings.muteUponEntry) &&
        Objects.equals(this.watermark, requestCreateMeetingSettings.watermark) &&
        Objects.equals(this.usePmi, requestCreateMeetingSettings.usePmi) &&
        Objects.equals(this.approvalType, requestCreateMeetingSettings.approvalType) &&
        Objects.equals(this.registrationType, requestCreateMeetingSettings.registrationType) &&
        Objects.equals(this.audio, requestCreateMeetingSettings.audio) &&
        Objects.equals(this.autoRecording, requestCreateMeetingSettings.autoRecording) &&
        Objects.equals(this.alternativeHosts, requestCreateMeetingSettings.alternativeHosts) &&
        Objects.equals(this.closeRegistration, requestCreateMeetingSettings.closeRegistration) &&
        Objects.equals(this.waitingRoom, requestCreateMeetingSettings.waitingRoom) &&
        Objects.equals(this.globalDialInCountries, requestCreateMeetingSettings.globalDialInCountries) &&
        Objects.equals(this.contactName, requestCreateMeetingSettings.contactName) &&
        Objects.equals(this.contactEmail, requestCreateMeetingSettings.contactEmail) &&
        Objects.equals(this.registrantsEmailNotification, requestCreateMeetingSettings.registrantsEmailNotification) &&
        Objects.equals(this.registrantsConfirmationEmail, requestCreateMeetingSettings.registrantsConfirmationEmail) &&
        Objects.equals(this.meetingAuthentication, requestCreateMeetingSettings.meetingAuthentication) &&
        Objects.equals(this.authenticationOption, requestCreateMeetingSettings.authenticationOption) &&
        Objects.equals(this.authenticationDomains, requestCreateMeetingSettings.authenticationDomains) &&
        Objects.equals(this.authenticationException, requestCreateMeetingSettings.authenticationException) &&
        Objects.equals(this.additionalDataCenterRegions, requestCreateMeetingSettings.additionalDataCenterRegions) &&
        Objects.equals(this.breakoutRoom, requestCreateMeetingSettings.breakoutRoom) &&
        Objects.equals(this.languageInterpretation, requestCreateMeetingSettings.languageInterpretation) &&
        Objects.equals(this.showShareButton, requestCreateMeetingSettings.showShareButton) &&
        Objects.equals(this.allowMultipleDevices, requestCreateMeetingSettings.allowMultipleDevices) &&
        Objects.equals(this.encryptionType, requestCreateMeetingSettings.encryptionType) &&
        Objects.equals(this.approvedOrDeniedCountriesOrRegions, requestCreateMeetingSettings.approvedOrDeniedCountriesOrRegions) &&
        Objects.equals(this.alternativeHostsEmailNotification, requestCreateMeetingSettings.alternativeHostsEmailNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostVideo, participantVideo, cnMeeting, inMeeting, joinBeforeHost, jbhTime, muteUponEntry, watermark, usePmi, approvalType, registrationType, audio, autoRecording, alternativeHosts, closeRegistration, waitingRoom, globalDialInCountries, contactName, contactEmail, registrantsEmailNotification, registrantsConfirmationEmail, meetingAuthentication, authenticationOption, authenticationDomains, authenticationException, additionalDataCenterRegions, breakoutRoom, languageInterpretation, showShareButton, allowMultipleDevices, encryptionType, approvedOrDeniedCountriesOrRegions, alternativeHostsEmailNotification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCreateMeetingSettings {\n");

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
    sb.append("    alternativeHosts: ").append(toIndentedString(alternativeHosts)).append("\n");
    sb.append("    closeRegistration: ").append(toIndentedString(closeRegistration)).append("\n");
    sb.append("    waitingRoom: ").append(toIndentedString(waitingRoom)).append("\n");
    sb.append("    globalDialInCountries: ").append(toIndentedString(globalDialInCountries)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    registrantsEmailNotification: ").append(toIndentedString(registrantsEmailNotification)).append("\n");
    sb.append("    registrantsConfirmationEmail: ").append(toIndentedString(registrantsConfirmationEmail)).append("\n");
    sb.append("    meetingAuthentication: ").append(toIndentedString(meetingAuthentication)).append("\n");
    sb.append("    authenticationOption: ").append(toIndentedString(authenticationOption)).append("\n");
    sb.append("    authenticationDomains: ").append(toIndentedString(authenticationDomains)).append("\n");
    sb.append("    authenticationException: ").append(toIndentedString(authenticationException)).append("\n");
    sb.append("    additionalDataCenterRegions: ").append(toIndentedString(additionalDataCenterRegions)).append("\n");
    sb.append("    breakoutRoom: ").append(toIndentedString(breakoutRoom)).append("\n");
    sb.append("    languageInterpretation: ").append(toIndentedString(languageInterpretation)).append("\n");
    sb.append("    showShareButton: ").append(toIndentedString(showShareButton)).append("\n");
    sb.append("    allowMultipleDevices: ").append(toIndentedString(allowMultipleDevices)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    approvedOrDeniedCountriesOrRegions: ").append(toIndentedString(approvedOrDeniedCountriesOrRegions)).append("\n");
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
