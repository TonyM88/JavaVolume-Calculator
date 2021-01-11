package volcalWANDISOCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class volcalSphere implements volumeCalculation {
	// equation function for Sphere volume
	@Override
	public double calculation(int a) {

		return ((4.0 / 3.0) * Math.PI * (a * a * a));
	}

	@Override
	public double decFormat(double ans) {
		BigDecimal db = new BigDecimal(ans).setScale(2, RoundingMode.HALF_EVEN);
		ans = db.doubleValue();
		return ans;
	}

}