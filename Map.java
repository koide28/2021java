package CLASSROOM.Session37;

public class Map{
    private final int NO_SHIP=0;
    private final int SHIP = 1;
    private int[][] map;

    public Map(){
        ;//nothing
    }

    /**
     * マップを初期化する
     * @param mapSize マップのサイズ
     */
    public void init(int mapSize){
        map = new int[mapSize][mapSize];
        for(int i = 0; i < mapSize; i++ ){
            for(int j = 0; j < mapSize; j++){
                map[i][j] = NO_SHIP;
            }
        }
    }

    /**
     * 船を配置する
     * @param ship 配置する対象の船
     * @return true（配置完了）/false（配置エラー）
     */
    public boolean deployShip(Ship ship){
        int x = ship.getPosX();
        int y = ship.getPosY();
        
        if( x >= map.length || y >= map.length){
            return false;
        }

        if( map[x][y] != NO_SHIP){
            return false;
        }

        map[x][y] = SHIP;

        return true;
    }

    /**
     * マップの指定位置をクリア（船無し）にする
     * @param x
     * @param y
     */
    public void clear(int x,int y){
        
        if( x >= map.length || y >= map.length){
            return;
        }

        map[x][y] = NO_SHIP;
    }
}