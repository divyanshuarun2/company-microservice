package com.andygalem.companyms.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    // since there is a mapping of one-to-many with job
    // so we will store a list of job ids
    private List<Long> jobId;

    //      monolithic
    //this means company table has relationship with job table
    // job table has  company column
//    @OneToMany(mappedBy = "company")
//    private List<Job> jobs;


//    @OneToMany(mappedBy = "company")
//    private List<Review> reviews;
    private List<Long> reviewId;



    public Company() {

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getJobId() {
        return jobId;
    }

    public void setJobId(List<Long> jobId) {
        this.jobId = jobId;
    }

    public List<Long> getReviewId() {
        return reviewId;
    }

    public void setReviewId(List<Long> reviewId) {
        this.reviewId = reviewId;
    }
}
