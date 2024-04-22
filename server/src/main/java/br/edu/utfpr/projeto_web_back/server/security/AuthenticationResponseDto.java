package br.edu.utfpr.projeto_web_back.server.security;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponseDto {

    private String token;

}
