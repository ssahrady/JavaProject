// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package itcollege.ee.entities;

import java.lang.String;

privileged aspect Vahtkond_Roo_ToString {
    
    public String Vahtkond.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alates: ").append(getAlates()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Komentaar: ").append(getKomentaar()).append(", ");
        sb.append("Kood: ").append(getKood()).append(", ");
        sb.append("Kuni: ").append(getKuni()).append(", ");
        sb.append("Nimetus: ").append(getNimetus()).append(", ");
        sb.append("Piiripunkt: ").append(getPiiripunkt() == null ? "null" : getPiiripunkt().size()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
