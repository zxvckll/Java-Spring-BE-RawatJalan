package com.syamsandi.java_rs_rawat_jalan.model.user_profile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfileResponse {

  private UUID userProfileId;

  private String name;

  private String imageUrl;

  private String dateOfBirth;

  private String address;
}
