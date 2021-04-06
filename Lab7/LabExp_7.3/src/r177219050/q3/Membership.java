package r177219050.q3;

public class Membership implements MembershipAcc {

	@Override
	public void PlaneInfo_Premium() {
		// TODO Auto-generated method stub
		System.out.println("Premium plane at cost:"+Premium.PRICE+" with "+ Premium.LANGUAGES+" Languages ");
		
	}

	@Override
	public void PlaneInfo_Basic() {
		// TODO Auto-generated method stub
		System.out.println("Basic plane at cost:"+Basic.PRICE+" with "+ Basic.LANGUAGES+" Languages ");
		
	}

	@Override
	public void PlaneInfo_Free() {
		// TODO Auto-generated method stub
		System.out.println("Free plane at cost:"+Free.PRICE+" with "+ Free.LANGUAGES+" Languages ");
		
	}

	

}
