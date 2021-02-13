package guru.springframework.sfgjms.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 2479796464200986819L;

    private UUID id;
    private String message;
}
