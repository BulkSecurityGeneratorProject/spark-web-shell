package ai.bilge.spark.webshell.service.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Terminal entity.
 */
public class TerminalDTO implements Serializable {

    private Long id;

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TerminalDTO terminalDTO = (TerminalDTO) o;
        if(terminalDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), terminalDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TerminalDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            "}";
    }
}
