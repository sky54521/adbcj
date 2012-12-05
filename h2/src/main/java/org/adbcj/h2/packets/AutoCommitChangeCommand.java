package org.adbcj.h2.packets;

import org.adbcj.h2.decoding.IoUtils;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author roman.stoffel@gamlor.info
 */
public class AutoCommitChangeCommand implements ClientToServerPacket {
    public static final int SESSION_SET_AUTOCOMMIT = 15;
    private final AutoCommit autoCommit;

    public AutoCommitChangeCommand(AutoCommit autoCommit) {
        this.autoCommit = autoCommit;
    }

    @Override
    public void writeToStream(DataOutputStream stream) throws IOException {
        stream.writeInt(SESSION_SET_AUTOCOMMIT);
        IoUtils.writeBoolean(stream, autoCommit==AutoCommit.AUTO_COMMIT_ON);
    }

    @Override
    public int getLength() {
        return SizeConstants.INT_SIZE + SizeConstants.BYTE_SIZE;
    }

    public static enum AutoCommit{
        AUTO_COMMIT_ON,
        AUTO_COMMIT_OFF
    }
}