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

public final class UseItemCsReqOuterClass {
  /**
   * Protobuf type {@code UseItemCsReq}
   */
  public static final class UseItemCsReq extends ProtoMessage<UseItemCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 optional_reward_id = 4;</code>
     */
    private int optionalRewardId;

    /**
     * <code>optional uint32 use_item_id = 7;</code>
     */
    private int useItemId;

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 use_item_count = 13;</code>
     */
    private int useItemCount;

    /**
     * <code>optional .AvatarType use_avatar_type = 8;</code>
     */
    private int useAvatarType;

    private UseItemCsReq() {
    }

    /**
     * @return a new empty instance of {@code UseItemCsReq}
     */
    public static UseItemCsReq newInstance() {
      return new UseItemCsReq();
    }

    /**
     * <code>optional uint32 optional_reward_id = 4;</code>
     * @return whether the optionalRewardId field is set
     */
    public boolean hasOptionalRewardId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 optional_reward_id = 4;</code>
     * @return this
     */
    public UseItemCsReq clearOptionalRewardId() {
      bitField0_ &= ~0x00000001;
      optionalRewardId = 0;
      return this;
    }

    /**
     * <code>optional uint32 optional_reward_id = 4;</code>
     * @return the optionalRewardId
     */
    public int getOptionalRewardId() {
      return optionalRewardId;
    }

    /**
     * <code>optional uint32 optional_reward_id = 4;</code>
     * @param value the optionalRewardId to set
     * @return this
     */
    public UseItemCsReq setOptionalRewardId(final int value) {
      bitField0_ |= 0x00000001;
      optionalRewardId = value;
      return this;
    }

    /**
     * <code>optional uint32 use_item_id = 7;</code>
     * @return whether the useItemId field is set
     */
    public boolean hasUseItemId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 use_item_id = 7;</code>
     * @return this
     */
    public UseItemCsReq clearUseItemId() {
      bitField0_ &= ~0x00000002;
      useItemId = 0;
      return this;
    }

    /**
     * <code>optional uint32 use_item_id = 7;</code>
     * @return the useItemId
     */
    public int getUseItemId() {
      return useItemId;
    }

    /**
     * <code>optional uint32 use_item_id = 7;</code>
     * @param value the useItemId to set
     * @return this
     */
    public UseItemCsReq setUseItemId(final int value) {
      bitField0_ |= 0x00000002;
      useItemId = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return this
     */
    public UseItemCsReq clearBaseAvatarId() {
      bitField0_ &= ~0x00000004;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public UseItemCsReq setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000004;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 use_item_count = 13;</code>
     * @return whether the useItemCount field is set
     */
    public boolean hasUseItemCount() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 use_item_count = 13;</code>
     * @return this
     */
    public UseItemCsReq clearUseItemCount() {
      bitField0_ &= ~0x00000008;
      useItemCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 use_item_count = 13;</code>
     * @return the useItemCount
     */
    public int getUseItemCount() {
      return useItemCount;
    }

    /**
     * <code>optional uint32 use_item_count = 13;</code>
     * @param value the useItemCount to set
     * @return this
     */
    public UseItemCsReq setUseItemCount(final int value) {
      bitField0_ |= 0x00000008;
      useItemCount = value;
      return this;
    }

    /**
     * <code>optional .AvatarType use_avatar_type = 8;</code>
     * @return whether the useAvatarType field is set
     */
    public boolean hasUseAvatarType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .AvatarType use_avatar_type = 8;</code>
     * @return this
     */
    public UseItemCsReq clearUseAvatarType() {
      bitField0_ &= ~0x00000010;
      useAvatarType = 0;
      return this;
    }

    /**
     * <code>optional .AvatarType use_avatar_type = 8;</code>
     * @return the useAvatarType
     */
    public AvatarTypeOuterClass.AvatarType getUseAvatarType() {
      return AvatarTypeOuterClass.AvatarType.forNumber(useAvatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link UseItemCsReq#getUseAvatarType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getUseAvatarTypeValue() {
      return useAvatarType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link AvatarTypeOuterClass.AvatarType}. Setting an invalid value
     * can cause {@link UseItemCsReq#getUseAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public UseItemCsReq setUseAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000010;
      useAvatarType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType use_avatar_type = 8;</code>
     * @param value the useAvatarType to set
     * @return this
     */
    public UseItemCsReq setUseAvatarType(final AvatarTypeOuterClass.AvatarType value) {
      bitField0_ |= 0x00000010;
      useAvatarType = value.getNumber();
      return this;
    }

    @Override
    public UseItemCsReq copyFrom(final UseItemCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        optionalRewardId = other.optionalRewardId;
        useItemId = other.useItemId;
        baseAvatarId = other.baseAvatarId;
        useItemCount = other.useItemCount;
        useAvatarType = other.useAvatarType;
      }
      return this;
    }

    @Override
    public UseItemCsReq mergeFrom(final UseItemCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasOptionalRewardId()) {
        setOptionalRewardId(other.optionalRewardId);
      }
      if (other.hasUseItemId()) {
        setUseItemId(other.useItemId);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasUseItemCount()) {
        setUseItemCount(other.useItemCount);
      }
      if (other.hasUseAvatarType()) {
        setUseAvatarTypeValue(other.useAvatarType);
      }
      return this;
    }

    @Override
    public UseItemCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      optionalRewardId = 0;
      useItemId = 0;
      baseAvatarId = 0;
      useItemCount = 0;
      useAvatarType = 0;
      return this;
    }

    @Override
    public UseItemCsReq clearQuick() {
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
      if (!(o instanceof UseItemCsReq)) {
        return false;
      }
      UseItemCsReq other = (UseItemCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasOptionalRewardId() || optionalRewardId == other.optionalRewardId)
        && (!hasUseItemId() || useItemId == other.useItemId)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasUseItemCount() || useItemCount == other.useItemCount)
        && (!hasUseAvatarType() || useAvatarType == other.useAvatarType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(optionalRewardId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(useItemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(useItemCount);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 64);
        output.writeEnumNoTag(useAvatarType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(optionalRewardId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(useItemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(useItemCount);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(useAvatarType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UseItemCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // optionalRewardId
            optionalRewardId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // useItemId
            useItemId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // useItemCount
            useItemCount = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // useAvatarType
            final int value = input.readInt32();
            if (AvatarTypeOuterClass.AvatarType.forNumber(value) != null) {
              useAvatarType = value;
              bitField0_ |= 0x00000010;
            }
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
        output.writeUInt32(FieldNames.optionalRewardId, optionalRewardId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.useItemId, useItemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.useItemCount, useItemCount);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeEnum(FieldNames.useAvatarType, useAvatarType, AvatarTypeOuterClass.AvatarType.converter());
      }
      output.endObject();
    }

    @Override
    public UseItemCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1391749078:
          case -1451381236: {
            if (input.isAtField(FieldNames.optionalRewardId)) {
              if (!input.trySkipNullValue()) {
                optionalRewardId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -815318027:
          case 1396027151: {
            if (input.isAtField(FieldNames.useItemId)) {
              if (!input.trySkipNullValue()) {
                useItemId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1104380939:
          case 871430811: {
            if (input.isAtField(FieldNames.useItemCount)) {
              if (!input.trySkipNullValue()) {
                useItemCount = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1816914662:
          case -1808431192: {
            if (input.isAtField(FieldNames.useAvatarType)) {
              if (!input.trySkipNullValue()) {
                final AvatarTypeOuterClass.AvatarType value = input.readEnum(AvatarTypeOuterClass.AvatarType.converter());
                if (value != null) {
                  useAvatarType = value.getNumber();
                  bitField0_ |= 0x00000010;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public UseItemCsReq clone() {
      return new UseItemCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UseItemCsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UseItemCsReq(), data).checkInitialized();
    }

    public static UseItemCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UseItemCsReq(), input).checkInitialized();
    }

    public static UseItemCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UseItemCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating UseItemCsReq messages
     */
    public static MessageFactory<UseItemCsReq> getFactory() {
      return UseItemCsReqFactory.INSTANCE;
    }

    private enum UseItemCsReqFactory implements MessageFactory<UseItemCsReq> {
      INSTANCE;

      @Override
      public UseItemCsReq create() {
        return UseItemCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName optionalRewardId = FieldName.forField("optionalRewardId", "optional_reward_id");

      static final FieldName useItemId = FieldName.forField("useItemId", "use_item_id");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName useItemCount = FieldName.forField("useItemCount", "use_item_count");

      static final FieldName useAvatarType = FieldName.forField("useAvatarType", "use_avatar_type");
    }
  }
}
