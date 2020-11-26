package jp.ac.aiit.pbl.format.sep2020;

import java.util.Arrays;

public enum Event {

    EARTHQUAKE("0000000","Geo","Earthquake","Sudden movement of a block of the Earth’s crust along a geological fault and associated ground shaking.",""),
    TSUNAMI("0000001","Geo","Tsunami","A series of waves (with long wavelengths when traveling across the deep ocean) that are generated by a displacement of massive amounts of water through underwater earthquakes, volcanic eruptions or landslides. Tsunami waves travel at very high speed across the ocean but as they begin to reach shallow water they slow down and the wave grows steeper.",""),
    CRACK_IN_THE_GROUND_SINKHOLE("0000010","Geo","Crack in the Ground/Sinkhole","(Sinkhole)Collapse of the land surface due to the dissolving of the subsurface rocks such as limestone or carbonate rock by water.",""),
    AVALANCHE("0000011","Geo","Avalanche","(Avalanche)or falls rapidly down a mountainside under the force of gravity.• Snow Avalanche: Rapid downslope movement of a mix of snow and ice. Debris Avalanche: The sudden and very rapid downslope movement of unsorted mass of rock and soil. There are two general types of debris avalanches - a cold debris avalanche usually results from an unstable slope suddenly collapsing whereas a hot debris avalanche results from volcanic activity leading to slope instability and collapse.",""),
    SATELLITE_SPACE_REENTRY_DEBRIS_METEORITE("0000100","Geo","Satellite/Space Re-entry Debris/Meteorite","Satellite or parts of a satellite or launcher or space vehicle or meteorite entering or re-entering  from space into the earth atmosphere ",""),
    PYROCLASTIC_FLOW("0000101","Geo","Pyroclastic Flow","Extremely hot gases, ash, and other materials of more than 1,000 degrees Celsius that rapidly flow down the flank of a volcano (more than 700 km/h) during an eruption.",""),
    LAVA_FLOW("0000110","Geo","Lava Flow","The ejected magma that moves as a liquid mass downslope from a volcano during an eruption.",""),
    VOLCANIC_MUD_FLOW("0000111","Geo","Volcanic Mud Flow","(Also known as Lahar) A mud flow resulting from a volcanic event.",""),
    GLACIAL_ICE_AVALANCHE("0001000","Geo","Glacial Ice Avalanche","Ice calving at end of a Glacier",""),
    TIDAL_WAVE("0001001","Geo","Tidal Wave",""," Shallow water wave caused by the gravitational interactions between the Sun, Moon, and Earth (from USGS)"),
    LANDSLIDE("0001010","Geo","Landslide","(Landslide following earthquake)Independent of the presence of water, mass movement may also be triggered by earthquakes.",""),
    DEBRIS_FLOW("0010000","Geo","Debris Flow","(Debris flow, mud flow rock fall)Types of landslides that occur when heavy rain or rapid snow/ice melt send large amounts of vegetation, mud, or rock downslope by gravitational forces.",""),
    ASH_FALL("0010001","Geo","Ash Fall","Fine (less than 4 mm in diameter) unconsolidated volcanic debris blown into the atmosphere during an eruption; can remain airborne for long periods of time and travel considerable distance from the source.",""),
    VOLCANO_ERUPTION("0010010","Geo","Volcano Eruption","(Volcanic Activity)A type of volcanic event near an opening/vent in the Earth’s surface including volcanic eruptions of lava, ash, hot vapour, gas, and pyroclastic material.",""),
    TYPHOON_TROPICAL_CYCLONE("0100000","Met","Typhoon/Tropical Cyclone","(Tropical Cyclone)A tropical cyclone originates over tropical or subtropical waters. It is characterized by a warm-core, non-frontal synoptic-scale cyclone with a low pressure centre, spiral rain bands and strong winds. Depending on their location, tropical cyclones are referred to as hurricanes (Atlantic, Northeast Pacific), typhoons (Northwest Pacific), or cyclones (South Pacific and Indian Ocean).",""),
    TORNADO("0100001","Met","Tornado","A violently rotating column of air that reaches the ground or open water (waterspout).",""),
    STORM_OR_THUNDERSTORM("0100010","Met","Storm or Thunderstorm","","Meteorological event generating winds equal or higher than 10 on the Beaufort scale (Ref. WMO Classification)"),
    SNOW_STORM_BLIZZARD("0100011","Met","Snow Storm / Blizzard","(Winter Storm, Blizzard)A low pressure system in winter months with significantaccumulations of snow, freezing rain, sleet or ice. A blizzard is a severesnow storm with winds exceeding 35 mph (56 km/h) for three or morehours, producing reduced visibility (less than .25 mile (400 m).",""),
    HAIL("0100100","Met","Hail ","(Hail)Solid precipitation in the form of irregular pellets or balls of ice morethan 5 mm in diameter.",""),
    DUST_STORM("0100101","Met","Dust Storm","(Sandstorm, Dust Storm)Strong winds carry particles of sand aloft, but generally confined toless than 50 feet (15 m), especially common in arid and semi-aridenvironments. A dust storm is also characterized by strong winds butcarries smaller particles of dust rather than sand over an extensivearea.",""),
    WINDWAVE_STORM_SURGE("0100110","Met","WindWave/Storm Surge","(Storm Surge)An abnormal rise in sea level generated by a tropical cyclone or other intense storms.",""),
    HEAVY_RAIN("0100111","Met","Heavy Rain","Precise threshold is according to each local standard.",""),
    BLACK_ICE("0101000","Met","Black Ice","WMO Defintion: (1) Thin, new ice on freshwater or saltwater, appearing dark in colour because of its transparency, which is a result of its columnar grain structure. On lakes, black ice is commonly overlain by white ice formed from refrozen snow or slush. (2) A popular alternative for glaze. A thin sheet of ice, relatively dark in appearance, may form when light rain or drizzle falls on a road surface that is at a temperature below 0 °C or, alternatively, when water already on the road surface subsequently freezes when the temperature thereof falls below freezing point. It may also be formed when supercooled fog droplets are intercepted by buildings, fences and vegetation",""),
    HIGH_UV_RADIATION("0101001","Met","High UV radiation","Precise threshold is according to each local standard.",""),
    PLAGUE_OF_INSECTS("0101010","Met","Plague of Insects","","Infestation of insects or (from IFRC) Pervasive influx and development of insects or parasites affecting humans, animals, crops and materials. "),
    PEST_INFESTATION("0101011","Met","Pest Infestation","","(from GEMET )1) The occurrence of one or more pest species in an area or location where their numbers and impact are currently or potentially at intolerable levels. 2) A sudden increase in destructiveness or population numbers of a pest species in a given area. "),
    EPIZOOTIC("0101100","Met","Epizootic","An epidemic outbreak of disease in an animal population, often with the implication that it may extend to humans.",""),
    CONTAMINATED_DRINKING_WATER("0101101","Met","Contaminated drinking water","Drinking water containing contaminants (germs and/or chemicals) above the quality standard. Precise threshold accoiding to each local standard. ",""),
    HEAVY_SNOW("0110000","Met","Heavy Snow","Precise threshold is according to each local standard.",""),
    FLOOD("0110001","Met","Flood","A general term for the overflow of water from a stream channel onto normally dry land in the floodplain (riverine flooding), higher-than normal levels along the coast and in lakes or reservoirs (coastal flooding) as well as ponding of water at or near the point where the rain fell (flash floods).",""),
    LIGHTNING("0110010","Met","Lightning","A high-voltage, visible electrical discharge produced by a thunderstorm and followed by the sound of thunder.",""),
    EXTREME_HEAT("0110011","Met","Extreme Heat","(Extreme Temperature)A general term for temperature variations above (extreme heat) .",""),
    WIND_CHILL_FROST("0110100","Met","Wind Chill/Frost","(Frost)Frost is the consequence of radiative cooling resulting in the formation of thin ice crystals on the ground or other surfaces in the form of needles, feathers, scales, or fans. Frost occurs when thetemperature of surfaces is below freezing and water vapor from humid air forms solid deposits on the cold surface. Freeze occurs when the air temperature is at (32˚F/0˚C) or below over a widespread area for a climatologically significant period of time. Use of the term is usually restricted to advective situations or to occasions when wind or other conditions prevent frost. Frost and freeze are particularly damaging during the crop growing season.",""),
    WIND_CHILL_FROST2("0110101","Met","Wind Chill/Frost","(Derecho)Widespread and usually fast-moving windstorms associated with convection/convective storm. Derechos include downburst and straight-line winds. The damage from derechos is often confused with the damage from tornadoes.",""),
    FOG("0110110","Met","Fog","","WMO Defintion:  A suspension of very small, usually microscopic water droplets in the air, reducing visibility at the Earth’s surface"),
    SNOW_DRIFTS("0110111","Met","Snow drifts","","WMO Definition: Mass of snow heaped up by the wind and deposited along an obstruction or an irregularity of the terrain."),
    CHEMICAL_HAZARD("1000000","Safety","Chemical Hazard","Presence of hazardrous chemical materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    BIOLOGICAL_HAZARD("1000001","Safety","Biological Hazard","Presence of hazardous biological materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    RADIOLOGICAL_HAZARD("1000010","Safety","Radiological Hazard","Presence of hazardous radioactive materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    NUCLEAR_HAZARD("1000011","Safety","Nuclear Hazard","Presence of hazardous nuclear materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    EXPLOSIVE_HAZARD("1000100","Safety","Explosive Hazard","Presence of hazardous explosive materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    UNIDENTIFIED_MYSTERIOUS_ANIMAL("1000101","Safety","Unidentified Mysterious Animal","Presence of an unidentified animal which may present a risk or a potential risk to the health of humans, animals, plants, or the environment",""),
    UNDEFINED_FLYING_OBJECT("1000110","Safety","Undefined Flying Object","Presence of an unidentified flying object which may present a risk or potential risk to the health of humans, animals, plants, or the environement",""),
    CHEMICAL_ACCIDENT("1000111","Safety","Chemical Accident","","From WHO: an unexpected uncontrolled release of a chemical from its containment"),
    HAZARDOUS_MATERIAL_ACCIDENT("1001000","Safety","Hazardous Material Accident","An unexpected uncontrolled release of substances that have the potential to harm a person or the environment upon contact. ",""),
    DEMONSTRATION("1001001","Safety","Demonstration","A march or gathering of people taking part in to show their opposition to something or their support for something",""),
    ODOUR_NUISANCE("1001010","Safety","Odour Nuisance","Prolonged and offensive smell leading to the  impairment of human well-being over a certain period of time at regular or irregular intervals",""),
    MAJOR_EVENT("1001011","Safety","Major Event","Planned happening which may generate significant disruption in road traffic or transport ",""),
    RISK_OF_INFECTION("1001100","Safety","Risk of Infection","Present of infectious agent(s) that present a risk or potential risk to the health of humans, animals, plants, or the environment",""),
    NOISE_POLLUTION("1001101","Safety","Noise Pollution","Disturbing or unwanted noise that may present a potential risk to the health of humans, animals and wildlife",""),
    FOOD_SAFETY_ALERT("1001110","Safety","Food Safety Alert","Presence of unsafe food containing harmful bacteria, viruses, parasites or chemical substances that present a risk to the health of humans, animals, plants or the environment",""),
    SAFETY_WARNING("1001111","Safety","Safety Warning","Notice of an existing or potential danger which may present a risk or potential risk to the health of humans, animals, plants, or the environement",""),
    SHOOTING_OR_DANGER_DUE_TO_WEAPONS("1010000","Security","Shooting or Danger due to weapons","Dangerous use of firearm(s) or weapons in a populated area ",""),
    BALLISTIC_MISSILE_ATTACK("1010001","Security","Ballistic Missile Attack","Ballistic missile launch ",""),
    GUERRILLA_ATTACK_SPECIAL_FORCES_ATTACK("1010010","Security","Guerrilla Attack/Special Forces Attack","Military or paramilitary armed forces carrying violent actions",""),
    LARGE_SCALE_TERRORISM("1010011","Security","Large-scale Terrorism","Terrorist action aiming at generating a high number of victims or major material damage",""),
    AIR_STRIKE("1010100","Security","Air Strike","Attack performed by an aircraft, usually of military type, either by bombing (or similar), firing guns or missiles",""),
    HIJACK("1010101","Security","Hijack","Airplane or other vehicle under the control of hijackers",""),
    CHEMICAL_ATTACK("1010110","Security","Chemical Attack","Intentional use of dangerous chemical materials aiming at killing or damaging the health of humans, animals, plants, or the environment",""),
    EXPLOSIVE_MATERIAL_ATTACK("1010111","Security","Explosive Material Attack","Intentional use of explosive materials aiming at killing or damaging the health of humans, animals, plants, or the environment",""),
    ATTACK_ON_IT_SYSTEMS("1011000","Security","Attack on IT Systems","Intentional attempt to expose, alter, disable, destroy, steal or gain unauthorized access to or make unauthorized use of IT equipment",""),
    ATTACK_WITH_NUCLEAR_WEAPONS("1011001","Security","Attack with Nuclear Weapons","","From www.dhs.gov 'Attack performed with a device producing a nuclear explosion"),
    LIFE_THREATENING_SITUATION("1011010","Security","Life Threatening Situation","Emergency situation that requires immediate intervention to save the life of the persons concerned",""),
    HEALTH_HAZARD("1011011","Security","Health Hazard","Potential source of danger for individual's health",""),
    FIRST_SECOND_WORLD_WAR_BOMB("1011100","Security","First/Second World War Bomb","Unexploded bomb dating from the second world war",""),
    BOMB_AMUNITION_DISCOVERY("1011101","Security","Bomb/amunition discovery","Unexpected presence of bomb or amunition",""),
    OUTAGE_OF_IT_SYSTEMS("1011110","Security","Outage of IT systems","Interruption or failure of IT systems services ",""),
    NAUTICAL_DISASTER_MARITIME_MARINE_SECURITY("1100000","Transport","Nautical disaster/Maritime/Marine Security","Sinking ship or any other event occurring at sea which may present of security or safety risk",""),
    TRAIN_RAIL_ACCIDENT("1100001","Transport","Train/Rail Accident","Accident occurring on a railway and involving train(s) and/or other vehicles",""),
    BRIDGE_COLLAPSE("1100010","Transport","Bridge Collapse","Structural failure of a bridge resulting in its partial or total destruction",""),
    AIRCRAFT_CRASH("1100011","Transport","Aircraft Crash","Aircraft crash",""),
    OIL_SPILL("1100100","Transport","Oil Spill","Leak of oil or pollutant from a ship or other transportation mean resulting in pollution ",""),
    ROAD_TRAFFIC_ACCIDENT("1100101","Transport","Road Traffic Accident","Crash occuring on the road",""),
    TRAFFIC_ALERT("1100110","Transport","Traffic Alert","Annoucement of road traffic disruption",""),
    GAS_SUPPLY_OUTAGE("1100111","Transport","Gas Supply Outage","Interruption or failure of gas supply service",""),
    EMERGENCY_NUMBER_OUTAGE("1101001","Transport","Emergency Number Outage","Interruption or failure of emergency number service",""),
    TELEPHONE_LINE_OUTAGE("1101010","Transport","Telephone Line Outage","Interruption or failure of telephone service",""),
    POWER_OUTAGE("1101011","Transport","Power Outage","Interruption or failure of electricity distribution service",""),
    FOREST_FIRE("1110000","Fire/Env/Infra","Forest Fire","A type of wildfire in a wooded area.",""),
    STRUCTURE_FIRE_INDUSTRIAL_FIRE("1110001","Fire/Env/Infra","Structure Fire/Industrial Fire","Fire affecting the structural parts of a building or a fire affecting an industrial site ",""),
    GEOMAGNETIC_OR_SOLAR_STORM("1110010","Fire/Env/Infra","Geomagnetic or solar storm","A type of extraterrestrial hazard caused by solar wind shockwaves that temporarily disturb the Earth’s magnetosphere. Geomagnetic storms can disrupt power grids, spacecraft operations, and satellite communications.",""),
    MISSING_PERSON("1110011","Fire/Env/Infra","missing person","Unaccounted person whose health status (alive/dead) cannot be confirmed",""),
    AIR_POLLUTION("1110100","Fire/Env/Infra","Air pollution","Precise threshold is according to each local standard.",""),
    BUILDING_COLLAPSE("1110101","Fire/Env/Infra","Building Collapse","Sudden failure of the building structure resulting in its partial or total destruction",""),
    DAM_FAILURE_OR_BURSTING_OF_A_DAM("1110110","Fire/Env/Infra","Dam Failure or Bursting of a Dam","Incident at a dam potentially leading to the uncontrolled release of the dam content",""),
    DIKE_FAILURE_OR_BURSTING_OF_A_DIKE("1110111","Fire/Env/Infra","Dike Failure or Bursting of a Dike","Incident at a dike potentially leading to the uncontrolled release of water",""),
    FIRE_GASES("1111000","Fire/Env/Infra","Fire Gases","Potentially dangerous gases emitted from a fire",""),
    RISK_OF_FIRE("1111001","Fire/Env/Infra","Risk of Fire","Increased likelyhood of accidental fire",""),
    GAS_LEAK("1111010","Fire/Env/Infra","Gas Leak","Uncontrolled release of natural gas or gazeous product in the environment",""),
    NUCLEAR_POWER_STATION_ACCIDENT("1111011","Fire/Env/Infra","Nuclear power station accident","Accident occuring at an installation where power is generatd by a nuclear reactor",""),
    RAW_SEWAGE("1111100","Fire/Env/Infra","Raw Sewage","Release in the environment of untreated waste water",""),
    SIREN_TEST("1111101","Fire/Env/Infra","Siren Test","Test of a warning device emitting a loud noise",""),
    WARNING("1111110","Fire/Env/Infra","Warning","Anoucement of a potentially dangerous situation or event to the public",""),
    ACID_RAIN("1111111","Fire/Env/Infra","Acid Rain","","");


    private String id;

    private String eventCategory;

    private String eventSubCategory;

    private String definition1;

    private String definition2;

    public String getId(){
        return id;
    }

    public String getEventCategory(){
        return eventCategory;
    }

    public String getEventSubCategory(){
        return eventSubCategory;
    }

    public String getDefinition1(){
        return definition1;
    }

    public String getDefinition2(){
        return definition2;
    }

    private Event(String id, String eventCategory, String eventSubCategory, String definition1, String definition2){
        this.id = id;
        this.eventCategory = eventCategory;
        this.eventSubCategory = eventSubCategory;
        this.definition1 = definition1;
        this.definition2 =definition2;
    }

    public static Event getById(String id){
        return Arrays.stream(Event.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}