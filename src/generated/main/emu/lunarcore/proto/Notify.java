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
import us.hebi.quickbuf.Utf8String;

public final class Notify {

    public static final class RevcMsgScNotify
            extends ProtoMessage<RevcMsgScNotify>
            implements Cloneable {
        private static final long serialVersionUID = 0L;
        private final Msg msg = Msg.newInstance();

        private RevcMsgScNotify() {
        }

        public static RevcMsgScNotify newInstance() {
            return new RevcMsgScNotify();
        }

        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        public RevcMsgScNotify clearMsg() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.msg.clear();
            return this;
        }

        public Msg getMsg() {
            return this.msg;
        }

        public Msg getMutableMsg() {
            this.bitField0_ |= 1;
            return this.msg;
        }

        public RevcMsgScNotify setMsg(Msg msg) {
            this.bitField0_ |= 1;
            this.msg.copyFrom(msg);
            return this;
        }

        @Override
        public RevcMsgScNotify copyFrom(RevcMsgScNotify revcMsgScNotify) {
            this.cachedSize = revcMsgScNotify.cachedSize;
            if ((this.bitField0_ | revcMsgScNotify.bitField0_) == 0)
                return this;
            this.bitField0_ = revcMsgScNotify.bitField0_;
            this.msg.copyFrom(revcMsgScNotify.msg);
            return this;
        }

        @Override
        public RevcMsgScNotify mergeFrom(RevcMsgScNotify revcMsgScNotify) {
            if (revcMsgScNotify.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            if (!revcMsgScNotify.hasMsg())
                return this;
            this.getMutableMsg().mergeFrom(revcMsgScNotify.msg);
            return this;
        }

        @Override
        public RevcMsgScNotify clear() {
            if (this.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            this.bitField0_ = 0;
            this.msg.clear();
            return this;
        }

        @Override
        public RevcMsgScNotify clearQuick() {
            if (this.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            this.bitField0_ = 0;
            this.msg.clearQuick();
            return this;
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof RevcMsgScNotify)) {
                return false;
            }
            RevcMsgScNotify revcMsgScNotify = (RevcMsgScNotify) object;
            return this.bitField0_ == revcMsgScNotify.bitField0_
                    && (!this.hasMsg() || this.msg.equals(revcMsgScNotify.msg));
        }

        @Override
        public void writeTo(ProtoSink protoSink) throws IOException {
            if ((this.bitField0_ & 1) == 0)
                return;
            protoSink.writeRawByte((byte) 50);
            protoSink.writeMessageNoTag(this.msg);
        }

        @Override
        protected int computeSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 1) == 0)
                return n;
            n += 1 + ProtoSink.computeMessageSizeNoTag(this.msg);
            return n;
        }

        @Override
        public RevcMsgScNotify mergeFrom(ProtoSource protoSource) throws IOException {
            int n = protoSource.readTag();
            block4: while (true) {
                switch (n) {
                    case 50: {
                        protoSource.readMessage(this.msg);
                        this.bitField0_ |= 1;
                        n = protoSource.readTag();
                        if (n == 0)
                            return this;
                        continue block4;
                    }
                    default: {
                        if (!protoSource.skipField(n)) {
                            return this;
                        }
                        n = protoSource.readTag();
                        continue block4;
                    }
                    case 0:
                }
                break;
            }
            return this;
        }

        @Override
        public void writeTo(JsonSink jsonSink) throws IOException {
            jsonSink.beginObject();
            if ((this.bitField0_ & 1) != 0) {
                jsonSink.writeMessage(FieldNames.msg, this.msg);
            }
            jsonSink.endObject();
        }

        @Override
        public RevcMsgScNotify mergeFrom(JsonSource jsonSource) throws IOException {
            if (!jsonSource.beginObject()) {
                return this;
            }
            block3: while (true) {
                if (jsonSource.isAtEnd()) {
                    jsonSource.endObject();
                    return this;
                }
                switch (jsonSource.readFieldHash()) {
                    case 108417: {
                        if (jsonSource.isAtField(FieldNames.msg)) {
                            if (jsonSource.trySkipNullValue())
                                continue block3;
                            jsonSource.readMessage(this.msg);
                            this.bitField0_ |= 1;
                            continue block3;
                        }
                        jsonSource.skipUnknownField();
                        continue block3;
                    }
                }
                jsonSource.skipUnknownField();
            }
        }

        @Override
        public RevcMsgScNotify clone() {
            return new RevcMsgScNotify().copyFrom(this);
        }

        @Override
        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static RevcMsgScNotify parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (RevcMsgScNotify) ProtoMessage.mergeFrom(new RevcMsgScNotify(), byArray).checkInitialized();
        }

        public static RevcMsgScNotify parseFrom(ProtoSource protoSource) throws IOException {
            return (RevcMsgScNotify) ProtoMessage.mergeFrom(new RevcMsgScNotify(), protoSource).checkInitialized();
        }

        public static RevcMsgScNotify parseFrom(JsonSource jsonSource) throws IOException {
            return (RevcMsgScNotify) ProtoMessage.mergeFrom(new RevcMsgScNotify(), jsonSource).checkInitialized();
        }

        public static MessageFactory<RevcMsgScNotify> getFactory() {
            return RevcMsgScNotifyFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName msg = FieldName.forField("msg");

            FieldNames() {
            }
        }

        private static enum RevcMsgScNotifyFactory implements MessageFactory<RevcMsgScNotify> {
            INSTANCE;

            @Override
            public RevcMsgScNotify create() {
                return RevcMsgScNotify.newInstance();
            }
        }
    }

    public static final class Msg
            extends ProtoMessage<Msg>
            implements Cloneable {
        private static final long serialVersionUID = 0L;
        private long i9;
        private int i3;
        private int i11;
        private int i15;
        private final Utf8String text = Utf8String.newEmptyInstance();

        private Msg() {
        }

        public static Msg newInstance() {
            return new Msg();
        }

        public boolean hasI9() {
            return (this.bitField0_ & 1) != 0;
        }

        public Msg clearI9() {
            this.bitField0_ &= 0xFFFFFFFE;
            this.i9 = 0L;
            return this;
        }

        public long getI9() {
            return this.i9;
        }

        public Msg setI9(long l) {
            this.bitField0_ |= 1;
            this.i9 = l;
            return this;
        }

        public boolean hasI3() {
            return (this.bitField0_ & 2) != 0;
        }

        public Msg clearI3() {
            this.bitField0_ &= 0xFFFFFFFD;
            this.i3 = 0;
            return this;
        }

        public int getI3() {
            return this.i3;
        }

        public Msg setI3(int n) {
            this.bitField0_ |= 2;
            this.i3 = n;
            return this;
        }

        public boolean hasI11() {
            return (this.bitField0_ & 4) != 0;
        }

        public Msg clearI11() {
            this.bitField0_ &= 0xFFFFFFFB;
            this.i11 = 0;
            return this;
        }

        public int getI11() {
            return this.i11;
        }

        public Msg setI11(int n) {
            this.bitField0_ |= 4;
            this.i11 = n;
            return this;
        }

        public boolean hasI15() {
            return (this.bitField0_ & 8) != 0;
        }

        public Msg clearI15() {
            this.bitField0_ &= 0xFFFFFFF7;
            this.i15 = 0;
            return this;
        }

        public int getI15() {
            return this.i15;
        }

        public Msg setI15(int n) {
            this.bitField0_ |= 8;
            this.i15 = n;
            return this;
        }

        public boolean hasText() {
            return (this.bitField0_ & 0x10) != 0;
        }

        public Msg clearText() {
            this.bitField0_ &= 0xFFFFFFEF;
            this.text.clear();
            return this;
        }

        public String getText() {
            return this.text.getString();
        }

        public Utf8String getTextBytes() {
            return this.text;
        }

        public Utf8String getMutableTextBytes() {
            this.bitField0_ |= 0x10;
            return this.text;
        }

        public Msg setText(CharSequence charSequence) {
            this.bitField0_ |= 0x10;
            this.text.copyFrom(charSequence);
            return this;
        }

        public Msg setText(Utf8String utf8String) {
            this.bitField0_ |= 0x10;
            this.text.copyFrom(utf8String);
            return this;
        }

        @Override
        public Msg copyFrom(Msg msg) {
            this.cachedSize = msg.cachedSize;
            if ((this.bitField0_ | msg.bitField0_) == 0)
                return this;
            this.bitField0_ = msg.bitField0_;
            this.i9 = msg.i9;
            this.i3 = msg.i3;
            this.i11 = msg.i11;
            this.i15 = msg.i15;
            this.text.copyFrom(msg.text);
            return this;
        }

        @Override
        public Msg mergeFrom(Msg msg) {
            if (msg.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            if (msg.hasI9()) {
                this.setI9(msg.i9);
            }
            if (msg.hasI3()) {
                this.setI3(msg.i3);
            }
            if (msg.hasI11()) {
                this.setI11(msg.i11);
            }
            if (msg.hasI15()) {
                this.setI15(msg.i15);
            }
            if (!msg.hasText())
                return this;
            this.getMutableTextBytes().copyFrom(msg.text);
            return this;
        }

        @Override
        public Msg clear() {
            if (this.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            this.bitField0_ = 0;
            this.i9 = 0L;
            this.i3 = 0;
            this.i11 = 0;
            this.i15 = 0;
            this.text.clear();
            return this;
        }

        @Override
        public Msg clearQuick() {
            if (this.isEmpty()) {
                return this;
            }
            this.cachedSize = -1;
            this.bitField0_ = 0;
            this.text.clear();
            return this;
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof Msg)) {
                return false;
            }
            Msg msg = (Msg) object;
            return !(this.bitField0_ != msg.bitField0_ || this.hasI9() && this.i9 != msg.i9
                    || this.hasI3() && this.i3 != msg.i3 || this.hasI11() && this.i11 != msg.i11
                    || this.hasI15() && this.i15 != msg.i15 || this.hasText() && !this.text.equals(msg.text));
        }

        @Override
        public void writeTo(ProtoSink protoSink) throws IOException {
            if ((this.bitField0_ & 1) != 0) {
                protoSink.writeRawByte((byte) 72);
                protoSink.writeUInt64NoTag(this.i9);
            }
            if ((this.bitField0_ & 2) != 0) {
                protoSink.writeRawByte((byte) 24);
                protoSink.writeUInt32NoTag(this.i3);
            }
            if ((this.bitField0_ & 4) != 0) {
                protoSink.writeRawByte((byte) 88);
                protoSink.writeUInt32NoTag(this.i11);
            }
            if ((this.bitField0_ & 8) != 0) {
                protoSink.writeRawByte((byte) 120);
                protoSink.writeUInt32NoTag(this.i15);
            }
            if ((this.bitField0_ & 0x10) == 0)
                return;
            protoSink.writeRawByte((byte) 34);
            protoSink.writeStringNoTag(this.text);
        }

        @Override
        protected int computeSerializedSize() {
            int n = 0;
            if ((this.bitField0_ & 1) != 0) {
                n += 1 + ProtoSink.computeUInt64SizeNoTag(this.i9);
            }
            if ((this.bitField0_ & 2) != 0) {
                n += 1 + ProtoSink.computeUInt32SizeNoTag(this.i3);
            }
            if ((this.bitField0_ & 4) != 0) {
                n += 1 + ProtoSink.computeUInt32SizeNoTag(this.i11);
            }
            if ((this.bitField0_ & 8) != 0) {
                n += 1 + ProtoSink.computeUInt32SizeNoTag(this.i15);
            }
            if ((this.bitField0_ & 0x10) == 0)
                return n;
            n += 1 + ProtoSink.computeStringSizeNoTag(this.text);
            return n;
        }

        @Override
        public Msg mergeFrom(ProtoSource protoSource) throws IOException {
            int n = protoSource.readTag();
            block8: while (true) {
                switch (n) {
                    case 72: {
                        this.i9 = protoSource.readUInt64();
                        this.bitField0_ |= 1;
                        n = protoSource.readTag();
                        if (n != 24)
                            continue block8;
                    }
                    case 24: {
                        this.i3 = protoSource.readUInt32();
                        this.bitField0_ |= 2;
                        n = protoSource.readTag();
                        if (n != 88)
                            continue block8;
                    }
                    case 88: {
                        this.i11 = protoSource.readUInt32();
                        this.bitField0_ |= 4;
                        n = protoSource.readTag();
                        if (n != 120)
                            continue block8;
                    }
                    case 120: {
                        this.i15 = protoSource.readUInt32();
                        this.bitField0_ |= 8;
                        n = protoSource.readTag();
                        if (n != 34)
                            continue block8;
                    }
                    case 34: {
                        protoSource.readString(this.text);
                        this.bitField0_ |= 0x10;
                        n = protoSource.readTag();
                        if (n == 0)
                            return this;
                        continue block8;
                    }
                    default: {
                        if (!protoSource.skipField(n)) {
                            return this;
                        }
                        n = protoSource.readTag();
                        continue block8;
                    }
                    case 0:
                }
                break;
            }
            return this;
        }

        @Override
        public void writeTo(JsonSink jsonSink) throws IOException {
            jsonSink.beginObject();
            if ((this.bitField0_ & 1) != 0) {
                jsonSink.writeUInt64(FieldNames.i9, this.i9);
            }
            if ((this.bitField0_ & 2) != 0) {
                jsonSink.writeUInt32(FieldNames.i3, this.i3);
            }
            if ((this.bitField0_ & 4) != 0) {
                jsonSink.writeUInt32(FieldNames.i11, this.i11);
            }
            if ((this.bitField0_ & 8) != 0) {
                jsonSink.writeUInt32(FieldNames.i15, this.i15);
            }
            if ((this.bitField0_ & 0x10) != 0) {
                jsonSink.writeString(FieldNames.text, this.text);
            }
            jsonSink.endObject();
        }

        @Override
        public Msg mergeFrom(JsonSource jsonSource) throws IOException {
            if (!jsonSource.beginObject()) {
                return this;
            }
            block7: while (true) {
                if (jsonSource.isAtEnd()) {
                    jsonSource.endObject();
                    return this;
                }
                switch (jsonSource.readFieldHash()) {
                    case 3312: {
                        if (jsonSource.isAtField(FieldNames.i9)) {
                            if (jsonSource.trySkipNullValue())
                                continue block7;
                            this.i9 = jsonSource.readUInt64();
                            this.bitField0_ |= 1;
                            continue block7;
                        }
                        jsonSource.skipUnknownField();
                        continue block7;
                    }
                    case 3306: {
                        if (jsonSource.isAtField(FieldNames.i3)) {
                            if (jsonSource.trySkipNullValue())
                                continue block7;
                            this.i3 = jsonSource.readUInt32();
                            this.bitField0_ |= 2;
                            continue block7;
                        }
                        jsonSource.skipUnknownField();
                        continue block7;
                    }
                    case 102473: {
                        if (jsonSource.isAtField(FieldNames.i11)) {
                            if (jsonSource.trySkipNullValue())
                                continue block7;
                            this.i11 = jsonSource.readUInt32();
                            this.bitField0_ |= 4;
                            continue block7;
                        }
                        jsonSource.skipUnknownField();
                        continue block7;
                    }
                    case 102477: {
                        if (jsonSource.isAtField(FieldNames.i15)) {
                            if (jsonSource.trySkipNullValue())
                                continue block7;
                            this.i15 = jsonSource.readUInt32();
                            this.bitField0_ |= 8;
                            continue block7;
                        }
                        jsonSource.skipUnknownField();
                        continue block7;
                    }
                    case 3556653: {
                        if (jsonSource.isAtField(FieldNames.text)) {
                            if (jsonSource.trySkipNullValue())
                                continue block7;
                            jsonSource.readString(this.text);
                            this.bitField0_ |= 0x10;
                            continue block7;
                        }
                        jsonSource.skipUnknownField();
                        continue block7;
                    }
                }
                jsonSource.skipUnknownField();
            }
        }

        @Override
        public Msg clone() {
            return new Msg().copyFrom(this);
        }

        @Override
        public boolean isEmpty() {
            return this.bitField0_ == 0;
        }

        public static Msg parseFrom(byte[] byArray) throws InvalidProtocolBufferException {
            return (Msg) ProtoMessage.mergeFrom(new Msg(), byArray).checkInitialized();
        }

        public static Msg parseFrom(ProtoSource protoSource) throws IOException {
            return (Msg) ProtoMessage.mergeFrom(new Msg(), protoSource).checkInitialized();
        }

        public static Msg parseFrom(JsonSource jsonSource) throws IOException {
            return (Msg) ProtoMessage.mergeFrom(new Msg(), jsonSource).checkInitialized();
        }

        public static MessageFactory<Msg> getFactory() {
            return MsgFactory.INSTANCE;
        }

        static class FieldNames {
            static final FieldName i9 = FieldName.forField("i9");
            static final FieldName i3 = FieldName.forField("i3");
            static final FieldName i11 = FieldName.forField("i11");
            static final FieldName i15 = FieldName.forField("i15");
            static final FieldName text = FieldName.forField("text");

            FieldNames() {
            }
        }

        private static enum MsgFactory implements MessageFactory<Msg> {
            INSTANCE;

            @Override
            public Msg create() {
                return Msg.newInstance();
            }
        }
    }
}
