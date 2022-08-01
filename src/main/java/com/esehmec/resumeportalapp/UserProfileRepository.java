package com.esehmec.resumeportalapp;

import com.esehmec.resumeportalapp.model.UserProfile;
import com.esehmec.resumeportalapp.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {

    Optional<UserProfile> findByUserName(String userName);
}