package jk.whipround.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class WhiproundSumTest {

    @Test
    public void shouldReturn25Percent(){
        Whipround whipround = new Whipround(BigDecimal.valueOf(200), "test");
        WhiproundSum whiproundSum = new WhiproundSum(whipround, BigDecimal.valueOf(50));

        BigDecimal actual = whiproundSum.getPercentage();

        assertThat(BigDecimal.valueOf(25). compareTo(actual)).isEqualTo(0);
    }
}
