package Ex;

public class Kim2Mile extends Converter {

	public void Km2Mile(double mile) {
		super.ratio = mile;
	}

	@Override
	protected double convert(double src) {
		return src / super.ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}
