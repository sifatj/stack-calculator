import java.util.Stack;

public class Calculator {
	Stack<Integer> stack; 
	
	public Calculator() {
		stack = new Stack<>();
	}
	
	public void loadConstant(int i) {
		stack.add(i);
	}

	public void add() {
		//
		
	}

	public void subtract() {
		// 
		
	}

	public void multiply() {
		//
		
	}

	public void divide() {
		// 
		
	}
	@Override
	public String toString() {
		if(stack.empty()) {
			return "[].";
		}else {
			int num = 0;
			
			for(int i = 0; i < stack.size(); i++) {
				num += stack.pop();
				//return "[" + num + "].";
			}
			return "[" + num + "].";
		}
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}
	
	
}
