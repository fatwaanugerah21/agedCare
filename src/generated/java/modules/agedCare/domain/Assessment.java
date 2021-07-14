package modules.agedCare.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import modules.admin.User.UserExtension;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.DateTime;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.types.jaxb.DateTimeMapper;

/**
 * Assessment
 * 
 * @navhas n assessmentCreatedBy 1 User
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Assessment extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "agedCare";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Assessment";

	/** @hidden */
	public static final String hygieneAssessmentPropertyName = "hygieneAssessment";

	/** @hidden */
	public static final String painAssessmentPropertyName = "painAssessment";

	/** @hidden */
	public static final String continenceAssessmentPropertyName = "continenceAssessment";

	/** @hidden */
	public static final String sleepAssessmentPropertyName = "sleepAssessment";

	/** @hidden */
	public static final String behaviourAssessmentPropertyName = "behaviourAssessment";

	/** @hidden */
	public static final String assessmentCreatedByPropertyName = "assessmentCreatedBy";

	/** @hidden */
	public static final String assessmentReviewTimePropertyName = "assessmentReviewTime";

	/**
	 * Hygiene Assessment
	 **/
	private String hygieneAssessment;

	/**
	 * Pain Assessment
	 **/
	private String painAssessment;

	/**
	 * Continence Assessment
	 **/
	private String continenceAssessment;

	/**
	 * Sleep Assessment
	 **/
	private String sleepAssessment;

	/**
	 * Behaviour Assessment
	 **/
	private String behaviourAssessment;

	/**
	 * Assessment Created By
	 **/
	private UserExtension assessmentCreatedBy = null;

	/**
	 * Assessment Review Time
	 **/
	private DateTime assessmentReviewTime;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Assessment.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Assessment.DOCUMENT_NAME;
	}

	public static Assessment newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Assessment - {hygieneAssessment}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Assessment) && 
					this.getBizId().equals(((Assessment) o).getBizId()));
	}

	/**
	 * {@link #hygieneAssessment} accessor.
	 * @return	The value.
	 **/
	public String getHygieneAssessment() {
		return hygieneAssessment;
	}

	/**
	 * {@link #hygieneAssessment} mutator.
	 * @param hygieneAssessment	The new value.
	 **/
	@XmlElement
	public void setHygieneAssessment(String hygieneAssessment) {
		preset(hygieneAssessmentPropertyName, hygieneAssessment);
		this.hygieneAssessment = hygieneAssessment;
	}

	/**
	 * {@link #painAssessment} accessor.
	 * @return	The value.
	 **/
	public String getPainAssessment() {
		return painAssessment;
	}

	/**
	 * {@link #painAssessment} mutator.
	 * @param painAssessment	The new value.
	 **/
	@XmlElement
	public void setPainAssessment(String painAssessment) {
		preset(painAssessmentPropertyName, painAssessment);
		this.painAssessment = painAssessment;
	}

	/**
	 * {@link #continenceAssessment} accessor.
	 * @return	The value.
	 **/
	public String getContinenceAssessment() {
		return continenceAssessment;
	}

	/**
	 * {@link #continenceAssessment} mutator.
	 * @param continenceAssessment	The new value.
	 **/
	@XmlElement
	public void setContinenceAssessment(String continenceAssessment) {
		preset(continenceAssessmentPropertyName, continenceAssessment);
		this.continenceAssessment = continenceAssessment;
	}

	/**
	 * {@link #sleepAssessment} accessor.
	 * @return	The value.
	 **/
	public String getSleepAssessment() {
		return sleepAssessment;
	}

	/**
	 * {@link #sleepAssessment} mutator.
	 * @param sleepAssessment	The new value.
	 **/
	@XmlElement
	public void setSleepAssessment(String sleepAssessment) {
		preset(sleepAssessmentPropertyName, sleepAssessment);
		this.sleepAssessment = sleepAssessment;
	}

	/**
	 * {@link #behaviourAssessment} accessor.
	 * @return	The value.
	 **/
	public String getBehaviourAssessment() {
		return behaviourAssessment;
	}

	/**
	 * {@link #behaviourAssessment} mutator.
	 * @param behaviourAssessment	The new value.
	 **/
	@XmlElement
	public void setBehaviourAssessment(String behaviourAssessment) {
		preset(behaviourAssessmentPropertyName, behaviourAssessment);
		this.behaviourAssessment = behaviourAssessment;
	}

	/**
	 * {@link #assessmentCreatedBy} accessor.
	 * @return	The value.
	 **/
	public UserExtension getAssessmentCreatedBy() {
		return assessmentCreatedBy;
	}

	/**
	 * {@link #assessmentCreatedBy} mutator.
	 * @param assessmentCreatedBy	The new value.
	 **/
	@XmlElement
	public void setAssessmentCreatedBy(UserExtension assessmentCreatedBy) {
		if (this.assessmentCreatedBy != assessmentCreatedBy) {
			preset(assessmentCreatedByPropertyName, assessmentCreatedBy);
			this.assessmentCreatedBy = assessmentCreatedBy;
		}
	}

	/**
	 * {@link #assessmentReviewTime} accessor.
	 * @return	The value.
	 **/
	public DateTime getAssessmentReviewTime() {
		return assessmentReviewTime;
	}

	/**
	 * {@link #assessmentReviewTime} mutator.
	 * @param assessmentReviewTime	The new value.
	 **/
	@XmlElement
	@XmlSchemaType(name = "dateTime")
	@XmlJavaTypeAdapter(DateTimeMapper.class)
	public void setAssessmentReviewTime(DateTime assessmentReviewTime) {
		preset(assessmentReviewTimePropertyName, assessmentReviewTime);
		this.assessmentReviewTime = assessmentReviewTime;
	}
}
