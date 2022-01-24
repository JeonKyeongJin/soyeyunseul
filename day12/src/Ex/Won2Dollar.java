package Ex;

public class Won2Dollar extends Converter {
	public Won2Dollar(double won) {
		super.ratio = won;
	}

	@Override
	protected double convert(double src) {
		return src / super.ratio;
	}

	@Override
	protected String getSrcString() {

		return "¿ø";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "´Þ·¯";
	}

}
