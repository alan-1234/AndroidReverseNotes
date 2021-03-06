package com.tencent.p177mm.plugin.wallet_payu.balance.p1316a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.wallet_core.p1512e.p1513a.C36383a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_payu.balance.a.b */
public final class C22692b extends C36383a {
    public String cuZ;
    public String czZ;
    public String kBE;
    public double pTN;
    public String pin;
    public boolean tSA;
    public String tSB;
    public String tSs;
    public String tSt;
    public String tSu;
    public String tSv;
    public int tSw;
    public boolean tSx;
    public String tSy;
    public String tSz;

    public C22692b(String str, String str2, String str3, double d, String str4, String str5, String str6, String str7) {
        AppMethodBeat.m2504i(48322);
        this.pin = str;
        this.tSs = str2;
        this.czZ = str3;
        this.pTN = d;
        this.cuZ = str4;
        this.tSt = str5;
        this.tSu = str6;
        this.tSv = str7;
        HashMap hashMap = new HashMap();
        hashMap.put("pin", str);
        hashMap.put("bind_serial", str5);
        hashMap.put("req_key", str3);
        hashMap.put("fee_type", str4);
        hashMap.put("total_fee", Math.round(100.0d * d));
        hashMap.put("bank_type", str6);
        hashMap.put("cvv", str2);
        hashMap.put("dest_bind_serial", str7);
        mo70323M(hashMap);
        AppMethodBeat.m2505o(48322);
    }

    public final int cOX() {
        return 10;
    }

    /* renamed from: a */
    public final void mo9383a(int i, String str, JSONObject jSONObject) {
        AppMethodBeat.m2504i(48323);
        this.kBE = jSONObject.optString("trans_id");
        this.tSw = jSONObject.optInt("response_result");
        this.tSx = jSONObject.optBoolean("redirect");
        this.tSy = jSONObject.optString("gateway_reference");
        this.tSz = jSONObject.optString("gateway_code");
        this.tSA = jSONObject.optBoolean("is_force_adjust");
        this.tSB = jSONObject.optString("force_adjust_code");
        AppMethodBeat.m2505o(48323);
    }
}
