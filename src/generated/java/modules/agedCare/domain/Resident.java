package modules.agedCare.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import modules.admin.domain.Contact;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.DateOnly;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.types.jaxb.DateOnlyMapper;

/**
 * Resident
 * 
 * @navhas n facilityName 1 Contact
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Resident extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "agedCare";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Resident";

	/** @hidden */
	public static final String residentIDPropertyName = "residentID";

	/** @hidden */
	public static final String residentNamePropertyName = "residentName";

	/** @hidden */
	public static final String photoPropertyName = "photo";

	/** @hidden */
	public static final String DOBPropertyName = "DOB";

	/** @hidden */
	public static final String roomNumberPropertyName = "roomNumber";

	/** @hidden */
	public static final String BIOPropertyName = "BIO";

	/** @hidden */
	public static final String admissionDatePropertyName = "admissionDate";

	/** @hidden */
	public static final String facilityNamePropertyName = "facilityName";

	/**
	 * ResidentID
	 **/
	private String residentID;

	/**
	 * Resident Name
	 **/
	private String residentName;

	/**
	 * Photo
	 **/
	private String photo;

	/**
	 * DOB
	 **/
	private DateOnly DOB;

	/**
	 * Room Number
	 **/
	private Integer roomNumber;

	/**
	 * BIO
	 **/
	private String BIO;

	/**
	 * Admission Date
	 **/
	private DateOnly admissionDate;

	/**
	 * Facility
	 **/
	private Contact facilityName = null;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Resident.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Resident.DOCUMENT_NAME;
	}

	public static Resident newInstance() {
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
			return org.skyve.util.Binder.formatMessage("Resident - {residentID}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Resident) && 
					this.getBizId().equals(((Resident) o).getBizId()));
	}

	/**
	 * {@link #residentID} accessor.
	 * @return	The value.
	 **/
	public String getResidentID() {
		return residentID;
	}

	/**
	 * {@link #residentID} mutator.
	 * @param residentID	The new value.
	 **/
	@XmlElement
	public void setResidentID(String residentID) {
		preset(residentIDPropertyName, residentID);
		this.residentID = residentID;
	}

	/**
	 * {@link #residentName} accessor.
	 * @return	The value.
	 **/
	public String getResidentName() {
		return residentName;
	}

	/**
	 * {@link #residentName} mutator.
	 * @param residentName	The new value.
	 **/
	@XmlElement
	public void setResidentName(String residentName) {
		preset(residentNamePropertyName, residentName);
		this.residentName = residentName;
	}

	/**
	 * {@link #photo} accessor.
	 * @return	The value.
	 **/
	public String getPhoto() {
		return photo;
	}

	/**
	 * {@link #photo} mutator.
	 * @param photo	The new value.
	 **/
	@XmlElement
	public void setPhoto(String photo) {
		preset(photoPropertyName, photo);
		this.photo = photo;
	}

	/**
	 * {@link #DOB} accessor.
	 * @return	The value.
	 **/
	public DateOnly getDOB() {
		return DOB;
	}

	/**
	 * {@link #DOB} mutator.
	 * @param DOB	The new value.
	 **/
	@XmlElement
	@XmlSchemaType(name = "date")
	@XmlJavaTypeAdapter(DateOnlyMapper.class)
	public void setDOB(DateOnly DOB) {
		preset(DOBPropertyName, DOB);
		this.DOB = DOB;
	}

	/**
	 * {@link #roomNumber} accessor.
	 * @return	The value.
	 **/
	public Integer getRoomNumber() {
		return roomNumber;
	}

	/**
	 * {@link #roomNumber} mutator.
	 * @param roomNumber	The new value.
	 **/
	@XmlElement
	public void setRoomNumber(Integer roomNumber) {
		preset(roomNumberPropertyName, roomNumber);
		this.roomNumber = roomNumber;
	}

	/**
	 * {@link #BIO} accessor.
	 * @return	The value.
	 **/
	public String getBIO() {
		return BIO;
	}

	/**
	 * {@link #BIO} mutator.
	 * @param BIO	The new value.
	 **/
	@XmlElement
	public void setBIO(String BIO) {
		preset(BIOPropertyName, BIO);
		this.BIO = BIO;
	}

	/**
	 * {@link #admissionDate} accessor.
	 * @return	The value.
	 **/
	public DateOnly getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * {@link #admissionDate} mutator.
	 * @param admissionDate	The new value.
	 **/
	@XmlElement
	@XmlSchemaType(name = "date")
	@XmlJavaTypeAdapter(DateOnlyMapper.class)
	public void setAdmissionDate(DateOnly admissionDate) {
		preset(admissionDatePropertyName, admissionDate);
		this.admissionDate = admissionDate;
	}

	/**
	 * {@link #facilityName} accessor.
	 * @return	The value.
	 **/
	public Contact getFacilityName() {
		return facilityName;
	}

	/**
	 * {@link #facilityName} mutator.
	 * @param facilityName	The new value.
	 **/
	@XmlElement
	public void setFacilityName(Contact facilityName) {
		if (this.facilityName != facilityName) {
			preset(facilityNamePropertyName, facilityName);
			this.facilityName = facilityName;
		}
	}
}
