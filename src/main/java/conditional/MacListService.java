package conditional;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
