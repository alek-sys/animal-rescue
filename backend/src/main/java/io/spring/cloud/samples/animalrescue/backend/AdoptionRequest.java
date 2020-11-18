package io.spring.cloud.samples.animalrescue.backend;

import java.util.Objects;

import org.springframework.data.annotation.Id;

@SuppressWarnings("nullness")
public class AdoptionRequest {
	@Id
	private Long id;

	private Long animalId;

	private String adopterName;

	private String email;

	private String notes;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AdoptionRequest that = (AdoptionRequest) o;
		return id.equals(that.id) &&
			animalId.equals(that.animalId) &&
			adopterName.equals(that.adopterName) &&
			Objects.equals(email, that.email) &&
			Objects.equals(notes, that.notes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, animalId, adopterName, email, notes);
	}

	@Override
	public String toString() {
		return "AdoptionRequest{" +
			"id=" + id +
			", animalId='" + animalId + '\'' +
			", adopterName='" + adopterName + '\'' +
			", email='" + email + '\'' +
			", notes='" + notes + '\'' +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Long animalId) {
		this.animalId = animalId;
	}

	public String getAdopterName() {
		return adopterName;
	}

	public void setAdopterName(String adopterName) {
		this.adopterName = adopterName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
