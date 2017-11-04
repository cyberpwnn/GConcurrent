package org.cyberpwn.gconcurrent;

public abstract class A extends Execution
{
	public static ParallelPoolManager mgr;

	public A()
	{
		mgr.queue(new Execution()
		{
			@Override
			public void run()
			{
				A.this.run();
			}
		});
	}
}
