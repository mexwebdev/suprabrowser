package ss.client.networking.protocol.actions;

import java.util.Hashtable;
import java.util.Vector;

import ss.client.networking.DialogsMainCli;
import ss.common.SSProtocolConstants;
import ss.util.SessionConstants;

public class MatchAgainstRecentHistoryHandler extends AbstractOldActionBuilder {

	@SuppressWarnings("unused")
	private static final org.apache.log4j.Logger logger = ss.global.SSLogger
			.getLogger(MatchAgainstRecentHistoryHandler.class);

	private DialogsMainCli cli;

	public MatchAgainstRecentHistoryHandler(DialogsMainCli cli) {
		this.cli = cli;
	}

	public String getProtocol() {
		return SSProtocolConstants.MATCH_AGAINST_RECENT_HISTORY;
	}

	@SuppressWarnings("unchecked")
	public void matchAgainstRecentHistory(Hashtable session2, Vector docsToMatch) {

		Hashtable toSend = (Hashtable) session2.clone();
		Hashtable test = new Hashtable();

		test.put(SessionConstants.PROTOCOL,
				SSProtocolConstants.MATCH_AGAINST_RECENT_HISTORY);
		test.put(SessionConstants.SESSION, toSend);
		test.put(SessionConstants.DOCS_TO_MATCH, docsToMatch);

		this.cli.sendFromQueue(test);
	}

}
