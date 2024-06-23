// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class StartPartialChallengeScRspOuterClass {
  /**
   * Protobuf type {@code StartPartialChallengeScRsp}
   */
  public static final class StartPartialChallengeScRsp extends ProtoMessage<StartPartialChallengeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     */
    private final SceneInfoOuterClass.SceneInfo scene = SceneInfoOuterClass.SceneInfo.newInstance();

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     */
    private final LineupInfoOuterClass.LineupInfo lineup = LineupInfoOuterClass.LineupInfo.newInstance();

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     */
    private final ChallengeInfoOuterClass.ChallengeInfo challengeInfo = ChallengeInfoOuterClass.ChallengeInfo.newInstance();

    private StartPartialChallengeScRsp() {
    }

    /**
     * @return a new empty instance of {@code StartPartialChallengeScRsp}
     */
    public static StartPartialChallengeScRsp newInstance() {
      return new StartPartialChallengeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public StartPartialChallengeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public StartPartialChallengeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     * @return whether the scene field is set
     */
    public boolean hasScene() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     * @return this
     */
    public StartPartialChallengeScRsp clearScene() {
      bitField0_ &= ~0x00000002;
      scene.clear();
      return this;
    }

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableScene()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneInfoOuterClass.SceneInfo getScene() {
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneInfoOuterClass.SceneInfo getMutableScene() {
      bitField0_ |= 0x00000002;
      return scene;
    }

    /**
     * <code>optional .SceneInfo scene = 7;</code>
     * @param value the scene to set
     * @return this
     */
    public StartPartialChallengeScRsp setScene(final SceneInfoOuterClass.SceneInfo value) {
      bitField0_ |= 0x00000002;
      scene.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     * @return whether the lineup field is set
     */
    public boolean hasLineup() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     * @return this
     */
    public StartPartialChallengeScRsp clearLineup() {
      bitField0_ &= ~0x00000004;
      lineup.clear();
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public LineupInfoOuterClass.LineupInfo getLineup() {
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public LineupInfoOuterClass.LineupInfo getMutableLineup() {
      bitField0_ |= 0x00000004;
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 9;</code>
     * @param value the lineup to set
     * @return this
     */
    public StartPartialChallengeScRsp setLineup(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000004;
      lineup.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     * @return whether the challengeInfo field is set
     */
    public boolean hasChallengeInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     * @return this
     */
    public StartPartialChallengeScRsp clearChallengeInfo() {
      bitField0_ &= ~0x00000008;
      challengeInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableChallengeInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeInfoOuterClass.ChallengeInfo getChallengeInfo() {
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeInfoOuterClass.ChallengeInfo getMutableChallengeInfo() {
      bitField0_ |= 0x00000008;
      return challengeInfo;
    }

    /**
     * <code>optional .ChallengeInfo challenge_info = 12;</code>
     * @param value the challengeInfo to set
     * @return this
     */
    public StartPartialChallengeScRsp setChallengeInfo(
        final ChallengeInfoOuterClass.ChallengeInfo value) {
      bitField0_ |= 0x00000008;
      challengeInfo.copyFrom(value);
      return this;
    }

    @Override
    public StartPartialChallengeScRsp copyFrom(final StartPartialChallengeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        scene.copyFrom(other.scene);
        lineup.copyFrom(other.lineup);
        challengeInfo.copyFrom(other.challengeInfo);
      }
      return this;
    }

    @Override
    public StartPartialChallengeScRsp mergeFrom(final StartPartialChallengeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasScene()) {
        getMutableScene().mergeFrom(other.scene);
      }
      if (other.hasLineup()) {
        getMutableLineup().mergeFrom(other.lineup);
      }
      if (other.hasChallengeInfo()) {
        getMutableChallengeInfo().mergeFrom(other.challengeInfo);
      }
      return this;
    }

    @Override
    public StartPartialChallengeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      scene.clear();
      lineup.clear();
      challengeInfo.clear();
      return this;
    }

    @Override
    public StartPartialChallengeScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      scene.clearQuick();
      lineup.clearQuick();
      challengeInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartPartialChallengeScRsp)) {
        return false;
      }
      StartPartialChallengeScRsp other = (StartPartialChallengeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasScene() || scene.equals(other.scene))
        && (!hasLineup() || lineup.equals(other.lineup))
        && (!hasChallengeInfo() || challengeInfo.equals(other.challengeInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(scene);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(lineup);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(challengeInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(scene);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(lineup);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(challengeInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartPartialChallengeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // scene
            input.readMessage(scene);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // lineup
            input.readMessage(lineup);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // challengeInfo
            input.readMessage(challengeInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.scene, scene);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.lineup, lineup);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.challengeInfo, challengeInfo);
      }
      output.endObject();
    }

    @Override
    public StartPartialChallengeScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109254796: {
            if (input.isAtField(FieldNames.scene)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(scene);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1102671473: {
            if (input.isAtField(FieldNames.lineup)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(lineup);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -812487759:
          case 602859274: {
            if (input.isAtField(FieldNames.challengeInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(challengeInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public StartPartialChallengeScRsp clone() {
      return new StartPartialChallengeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartPartialChallengeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeScRsp(), data).checkInitialized();
    }

    public static StartPartialChallengeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeScRsp(), input).checkInitialized();
    }

    public static StartPartialChallengeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartPartialChallengeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartPartialChallengeScRsp messages
     */
    public static MessageFactory<StartPartialChallengeScRsp> getFactory() {
      return StartPartialChallengeScRspFactory.INSTANCE;
    }

    private enum StartPartialChallengeScRspFactory implements MessageFactory<StartPartialChallengeScRsp> {
      INSTANCE;

      @Override
      public StartPartialChallengeScRsp create() {
        return StartPartialChallengeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName scene = FieldName.forField("scene");

      static final FieldName lineup = FieldName.forField("lineup");

      static final FieldName challengeInfo = FieldName.forField("challengeInfo", "challenge_info");
    }
  }
}
