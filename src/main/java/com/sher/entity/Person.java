package com.sher.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sher.dto.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "person")
public class Person {
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private final List<Membership> memberships = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private Long Id;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne(cascade =  CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "address_id",
            referencedColumnName = "address_id",
            insertable = false)
    private Address address;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "training_person",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "training_id"))
    private Set<Training> trainings;

    public Person() {
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void addMembership(Membership membership) {
        memberships.add(membership);
    }

    public Set<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(Set<Training> trainings) {
        this.trainings = trainings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(memberships, person.memberships) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                role == person.role &&
                Objects.equals(address, person.address) &&
                Objects.equals(visits, person.visits) &&
                Objects.equals(trainings, person.trainings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberships, firstName, lastName, role, address, visits, trainings);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", address=" + address +
                '}';
    }
}
