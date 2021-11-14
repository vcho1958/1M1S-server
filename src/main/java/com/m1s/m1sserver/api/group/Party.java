package com.m1s.m1sserver.api.group;

import com.m1s.m1sserver.api.admin.interest.Interest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name = "interest_id")
    @Getter @Setter
    private Interest interest;

    @Getter @Setter
    private String goal;

    @Getter @Setter
    private Integer maximum_number_of_people;

    @Getter @Setter
    private boolean recruit;
}
