package org.cyberpwn.gconcurrent;

public abstract class S extends Execution
{
	public static ParallelPoolManager mgr;

	public S()
	{
		mgr.syncQueue(new Execution()
		{
			@Override
			public void run()
			{
				S.this.run();
			}
		});
	}
}
