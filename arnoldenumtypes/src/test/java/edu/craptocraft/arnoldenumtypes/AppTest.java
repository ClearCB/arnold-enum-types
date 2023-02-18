package edu.craptocraft.arnoldenumtypes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void planetaConstructorTest() {
        // voy a asegurarme de que los metodos de los Enum Types
        // se comportan como yo espero
        Planeta planeta = Planeta.MERCURY;
        assertThat(planeta).isInstanceOf(Planeta.class);
        assertThat(planeta.ordinal()).isZero();
        assertThat(planeta.name()).isEqualToIgnoringCase("MERCURY");
        assertThat(Planeta.valueOf(planeta.name())).isEqualTo(Planeta.MERCURY);
        assertThat(planeta.compareTo(Planeta.MERCURY)).isZero();
        assertThat(planeta.toString()).isEqualToIgnoringCase("MERCURY");
        assertThat(planeta.equals(Planeta.MERCURY)).isTrue();
        assertThat(Planeta.values()[0]).isEqualTo(planeta);
    }
}
