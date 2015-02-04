package com.friss.example.service.person;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class Person {

    @JsonProperty
    private Integer id;

    @NotNull
    @JsonProperty
    private String firstName;
    
    @NotNull
    @JsonProperty
    private String lastName;
    
    @NotNull
    @JsonProperty
    private String email;
    
    @NotNull
    @JsonProperty
    private String country;
    
    @NotNull
    @JsonProperty
    private String companyName;

	@NotNull
    @JsonProperty
    private String ipAddress;
    
    @NotNull
    @JsonProperty
    private String jobTitle;
    
    @NotNull
    @JsonProperty
    private String bitcoinAddress;
    
    @NotNull
    @JsonProperty
    private String city;
    
    @NotNull
    @JsonProperty
    private String state;
    
    @NotNull
    @JsonProperty
    private String zipcode;
    
    @NotNull
    @JsonProperty
    private String address;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
		return firstName;
	}

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Person setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public Person setCountry(String country) {
		this.country = country;
		return this;
	}
	
	 public String getCompanyName() {
		return companyName;
	}

	public Person setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public Person setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public Person setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
		return this;
	}

	public String getBitcoinAddress() {
		return bitcoinAddress;
	}

	public Person setBitcoinAddress(String bitcoinAddress) {
		this.bitcoinAddress = bitcoinAddress;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Person setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public Person setState(String state) {
		this.state = state;
		return this;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Person setZipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Person setAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((bitcoinAddress == null) ? 0 : bitcoinAddress.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result
				+ ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bitcoinAddress == null) {
			if (other.bitcoinAddress != null)
				return false;
		} else if (!bitcoinAddress.equals(other.bitcoinAddress))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}
	
	
}
