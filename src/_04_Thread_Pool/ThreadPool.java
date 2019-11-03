package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	
	Thread[] threads;
	ConcurrentLinkedQueue<Task> taskQueue;

	public ThreadPool(int totalThreads) {
		// TODO Auto-generated constructor stub
		threads = new Thread[totalThreads];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Worker(taskQueue));
		}
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}

	public void addTask(Task task) {
		taskQueue.add(task);
	}
	
	public void start() throws InterruptedException {
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
			threads[i].join();
		}
	}

}
