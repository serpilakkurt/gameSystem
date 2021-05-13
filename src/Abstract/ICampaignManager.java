package Abstract;

import Entities.Game;

public interface ICampaignManager {
    void campaignAdd(Game game);
    void campaignUpdate(Game game);
    void campaignDelete(Game game);
    
}
