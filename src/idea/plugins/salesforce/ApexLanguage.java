package idea.plugins.salesforce;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ApexLanguage extends Language {
    public static final ApexLanguage INSTANCE = new ApexLanguage("Apex");
    protected ApexLanguage(@NotNull @NonNls String id) {
        super(id);
    }
}
