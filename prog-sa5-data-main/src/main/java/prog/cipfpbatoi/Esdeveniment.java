package prog.cipfpbatoi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Esdeveniment {
    private String tipus;
    private String descripcio;
    private String ubicacio;
    private LocalDate data;

    // ... constructores

    public void mostrarEsdeveniment() {
        String format = "%s (%s) -> %s - Data: %s";
        String jaRealitzat = jaHaOcorregut() ? "Ja realitzada" : "[Lloc: " + ubicacio + "]";
        System.out.printf(format, tipus, descripcio, jaRealitzat, data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void canviarData(int nousDies) {
        data = data.plusDays(nousDies);
    }

    public boolean esMesProxim(Esdeveniment altre, LocalDate dataReferencia) {
        return Math.abs(data.toEpochDay() - dataReferencia.toEpochDay()) <
                Math.abs(altre.data.toEpochDay() - dataReferencia.toEpochDay());
    }

    public boolean ocorreDespres(LocalDate data) {
        return data.isBefore(this.data);
    }

    public boolean jaHaOcorregut() {
        return LocalDate.now().isAfter(data);
    }

}
