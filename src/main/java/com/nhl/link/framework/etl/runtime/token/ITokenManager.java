package com.nhl.link.framework.etl.runtime.token;

import com.nhl.link.framework.etl.SyncToken;

public interface ITokenManager {

	/**
	 * Returns the last successfully processed token for a given task.
	 */
	SyncToken previousToken(SyncToken token);

	void saveToken(SyncToken token);
}
