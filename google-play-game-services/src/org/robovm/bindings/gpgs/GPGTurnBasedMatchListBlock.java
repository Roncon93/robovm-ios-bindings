package org.robovm.bindings.gpgs;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSError;

public interface GPGTurnBasedMatchListBlock {
	void invoke(NSArray matches, String pageToken, NSError error);
}
