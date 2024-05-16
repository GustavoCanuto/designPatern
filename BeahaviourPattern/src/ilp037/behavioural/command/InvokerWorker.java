package ilp037.behavioural.command;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvokerWorker  implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("Checking queue for new commands..");
			int size = InvokerQueue.size();
			if(size >0) {
				for(int i=0;i<InvokerQueue.size();i++) {
					InvokerQueue.poll().execute();
				}
			}
			System.out.println("Taking a nap before continue...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
