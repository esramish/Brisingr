public class Brisingr{
    public static void main(String[] args){
        if(args.length!=4){
            return;
        }
        String s = args[0] + args[1] + args[2] + args[3];
        if(s.length()!=15){
			return;
        }
		s = s.toLowerCase();
		
		int[] p = {14,0,13,9,10,4,8,11,2,3,6,5,12,1,7};
		int[] f = {1,1,2,1,1,1,2,2,1,2,1};
		int[] v = {33, 98, 101, 102, 103, 104, 105, 110, 111, 114, 116};
		int c = 0;
		for(int i = 0; i < 15; i++){
			if(s.charAt(p[i]) != v[c]){
				return;
			}
			f[c]--;
			c+=-(f[c]-1);
		}
		
		System.out.println("FLAAAAAAAAMES!!!!!");
    }
}
