package cz.trego.pdf;

import java.util.List;

/**
 * Created by cen29414 on 19.2.2016.
 */
public class VerificationResult {
    private boolean allSignaturesValid;
    private List<SignatureResult> signatureResults;

    public boolean isAllSignaturesValid() {
        return allSignaturesValid;
    }

    public void setAllSignaturesValid(boolean allSignaturesValid) {
        this.allSignaturesValid = allSignaturesValid;
    }

    public List<SignatureResult> getSignatureResults() {
        return signatureResults;
    }

    public void setSignatureResults(List<SignatureResult> signatureResults) {
        this.signatureResults = signatureResults;
    }
}
