package cz.trego.pdf;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Security;
import java.security.SignatureException;

/**
 * Created by cen29414 on 19.2.2016.
 */
public class PdfSignatureValidatorTest {

    @Before
    public void init() {
        BouncyCastleProvider provider = new BouncyCastleProvider();
        Security.addProvider(provider);
    }

    @Test
    public void test() {
        PdfSignatureValidator validator = new PdfSignatureValidator();
        try {
            Assert.assertTrue(validator.verifyPdf("c:\\Java\\PdfSignarureValidator\\src\\test\\resources\\ZD_04_01_VaVpI.pdf").isAllSignaturesValid());
            Assert.assertFalse(validator.verifyPdf("c:\\Java\\PdfSignarureValidator\\src\\test\\resources\\HelloWorld_sign.pdf").isAllSignaturesValid());
            Assert.assertTrue(validator.verifyPdf("c:\\Java\\PdfSignarureValidator\\src\\test\\resources\\no_signature.pdf").isNoSignature());
            Assert.assertFalse(validator.verifyPdf("c:\\Java\\PdfSignarureValidator\\src\\test\\resources\\SMLOUVA.pdf").isNoSignature());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
