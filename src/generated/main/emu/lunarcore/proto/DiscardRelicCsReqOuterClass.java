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

public final class DiscardRelicCsReqOuterClass {
  /**
   * Protobuf type {@code DiscardRelicCsReq}
   */
  public static final class DiscardRelicCsReq extends ProtoMessage<DiscardRelicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 relic_unique_id = 3;</code>
     */
    private int relicUniqueId;

    /**
     * <code>optional bool is_discard = 5;</code>
     */
    private boolean isDiscard;

    private DiscardRelicCsReq() {
    }

    /**
     * @return a new empty instance of {@code DiscardRelicCsReq}
     */
    public static DiscardRelicCsReq newInstance() {
      return new DiscardRelicCsReq();
    }

    /**
     * <code>optional uint32 relic_unique_id = 3;</code>
     * @return whether the relicUniqueId field is set
     */
    public boolean hasRelicUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 relic_unique_id = 3;</code>
     * @return this
     */
    public DiscardRelicCsReq clearRelicUniqueId() {
      bitField0_ &= ~0x00000001;
      relicUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 relic_unique_id = 3;</code>
     * @return the relicUniqueId
     */
    public int getRelicUniqueId() {
      return relicUniqueId;
    }

    /**
     * <code>optional uint32 relic_unique_id = 3;</code>
     * @param value the relicUniqueId to set
     * @return this
     */
    public DiscardRelicCsReq setRelicUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      relicUniqueId = value;
      return this;
    }

    /**
     * <code>optional bool is_discard = 5;</code>
     * @return whether the isDiscard field is set
     */
    public boolean hasIsDiscard() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_discard = 5;</code>
     * @return this
     */
    public DiscardRelicCsReq clearIsDiscard() {
      bitField0_ &= ~0x00000002;
      isDiscard = false;
      return this;
    }

    /**
     * <code>optional bool is_discard = 5;</code>
     * @return the isDiscard
     */
    public boolean getIsDiscard() {
      return isDiscard;
    }

    /**
     * <code>optional bool is_discard = 5;</code>
     * @param value the isDiscard to set
     * @return this
     */
    public DiscardRelicCsReq setIsDiscard(final boolean value) {
      bitField0_ |= 0x00000002;
      isDiscard = value;
      return this;
    }

    @Override
    public DiscardRelicCsReq copyFrom(final DiscardRelicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        relicUniqueId = other.relicUniqueId;
        isDiscard = other.isDiscard;
      }
      return this;
    }

    @Override
    public DiscardRelicCsReq mergeFrom(final DiscardRelicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRelicUniqueId()) {
        setRelicUniqueId(other.relicUniqueId);
      }
      if (other.hasIsDiscard()) {
        setIsDiscard(other.isDiscard);
      }
      return this;
    }

    @Override
    public DiscardRelicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      relicUniqueId = 0;
      isDiscard = false;
      return this;
    }

    @Override
    public DiscardRelicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DiscardRelicCsReq)) {
        return false;
      }
      DiscardRelicCsReq other = (DiscardRelicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasRelicUniqueId() || relicUniqueId == other.relicUniqueId)
        && (!hasIsDiscard() || isDiscard == other.isDiscard);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isDiscard);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DiscardRelicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // relicUniqueId
            relicUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isDiscard
            isDiscard = input.readBool();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.relicUniqueId, relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isDiscard, isDiscard);
      }
      output.endObject();
    }

    @Override
    public DiscardRelicCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1966200481:
          case 49648253: {
            if (input.isAtField(FieldNames.relicUniqueId)) {
              if (!input.trySkipNullValue()) {
                relicUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1091588116:
          case -1123290487: {
            if (input.isAtField(FieldNames.isDiscard)) {
              if (!input.trySkipNullValue()) {
                isDiscard = input.readBool();
                bitField0_ |= 0x00000002;
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
    public DiscardRelicCsReq clone() {
      return new DiscardRelicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DiscardRelicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DiscardRelicCsReq(), data).checkInitialized();
    }

    public static DiscardRelicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DiscardRelicCsReq(), input).checkInitialized();
    }

    public static DiscardRelicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DiscardRelicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DiscardRelicCsReq messages
     */
    public static MessageFactory<DiscardRelicCsReq> getFactory() {
      return DiscardRelicCsReqFactory.INSTANCE;
    }

    private enum DiscardRelicCsReqFactory implements MessageFactory<DiscardRelicCsReq> {
      INSTANCE;

      @Override
      public DiscardRelicCsReq create() {
        return DiscardRelicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName relicUniqueId = FieldName.forField("relicUniqueId", "relic_unique_id");

      static final FieldName isDiscard = FieldName.forField("isDiscard", "is_discard");
    }
  }
}
