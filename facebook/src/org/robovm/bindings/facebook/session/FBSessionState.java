
package org.robovm.bindings.facebook.session;

import org.robovm.rt.bro.ValuedEnum;

/** Passed to handler block each time a session state changes. */
public enum FBSessionState implements ValuedEnum {
	/** One of two initial states indicating that no valid cached token was found. */
	Created(0),
	/** One of two initial session states indicating that a cached token was loaded; when a session is in this state, a call to
	 * open* will result in an open session, without UX or app-switching. */
	CreatedTokenLoaded(1),
	/** One of three pre-open session states indicating that an attempt to open the session is underway. */
	Opening(2),
	/** Open session state indicating user has logged in or a cached token is available. */
	Open(1 | (1 << 9)),
	/** Open session state indicating token has been extended. */
	OpenTokenExtended(2 | (1 << 9)),
	/** Closed session state indicating that a login attempt failed. */
	ClosedLoginFailed(1 | (1 << 8)),
	/** Closed session state indicating that the session was closed, but the users token remains cached on the device for later use. */
	Closed(2 | (1 << 8));

	private final long n;

	private FBSessionState (long n) {
		this.n = n;
	}

	@Override
	public long value () {
		return n;
	}
}
