package dev.milzipmoza.tecobrary.core.domain.member.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberAuthService {

    private String key;
    private MemberAuthProvider provider;

    public MemberAuthService(String key, MemberAuthProvider provider) {
        this.key = key;
        this.provider = provider;
    }
}
