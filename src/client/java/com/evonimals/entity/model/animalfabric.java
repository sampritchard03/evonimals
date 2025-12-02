// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class animal extends EntityModel<Entity> {
	private final ModelPart rootgroup;
	private final ModelPart bodygroup;
	private final ModelPart body;
	private final ModelPart bodyseg1;
	private final ModelPart bodyseg2;
	private final ModelPart headgroup;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart head_detail;
	private final ModelPart snout;
	private final ModelPart snout1;
	private final ModelPart snout2;
	private final ModelPart eyes_r;
	private final ModelPart eye1_r;
	private final ModelPart eye2_r;
	private final ModelPart eye3_r;
	private final ModelPart eye4_r;
	private final ModelPart eye5_r;
	private final ModelPart eye6_r;
	private final ModelPart eyes_l;
	private final ModelPart eye1_l;
	private final ModelPart eye2_l;
	private final ModelPart eye3_l;
	private final ModelPart eye4_l;
	private final ModelPart eye5_l;
	private final ModelPart eye6_l;
	private final ModelPart sideeyes;
	private final ModelPart sideyes_l;
	private final ModelPart sideeye1_l;
	private final ModelPart sideeye2_l;
	private final ModelPart sideeye3_l;
	private final ModelPart sideeye4_l;
	private final ModelPart sideeye5_l;
	private final ModelPart sideeye6_l;
	private final ModelPart sideyes_r;
	private final ModelPart sideeye2_r;
	private final ModelPart sideeye1_r;
	private final ModelPart sideeye3_r;
	private final ModelPart sideeye4_r;
	private final ModelPart sideeye5_r;
	private final ModelPart sideeye6_r;
	private final ModelPart nose;
	private final ModelPart nose1;
	private final ModelPart nose2;
	private final ModelPart mouth;
	private final ModelPart mouth1;
	private final ModelPart mouth2;
	private final ModelPart ears_l;
	private final ModelPart topear_l;
	private final ModelPart sideear_l;
	private final ModelPart ears_r;
	private final ModelPart topear_r;
	private final ModelPart sideear_r;
	private final ModelPart arm_l;
	private final ModelPart arm_r;
	private final ModelPart frontleg_l;
	private final ModelPart frontleg_r;
	private final ModelPart leg_l;
	private final ModelPart leg_r;
	private final ModelPart tail1;
	private final ModelPart tail2;
	public animal(ModelPart root) {
		this.rootgroup = root.getChild("rootgroup");
		this.bodygroup = this.rootgroup.getChild("bodygroup");
		this.body = this.bodygroup.getChild("body");
		this.bodyseg1 = this.body.getChild("bodyseg1");
		this.bodyseg2 = this.body.getChild("bodyseg2");
		this.headgroup = this.bodygroup.getChild("headgroup");
		this.neck = this.headgroup.getChild("neck");
		this.head = this.headgroup.getChild("head");
		this.head_detail = this.head.getChild("head_detail");
		this.snout = this.head_detail.getChild("snout");
		this.snout1 = this.snout.getChild("snout1");
		this.snout2 = this.snout.getChild("snout2");
		this.eyes_r = this.head_detail.getChild("eyes_r");
		this.eye1_r = this.eyes_r.getChild("eye1_r");
		this.eye2_r = this.eyes_r.getChild("eye2_r");
		this.eye3_r = this.eyes_r.getChild("eye3_r");
		this.eye4_r = this.eyes_r.getChild("eye4_r");
		this.eye5_r = this.eyes_r.getChild("eye5_r");
		this.eye6_r = this.eyes_r.getChild("eye6_r");
		this.eyes_l = this.head_detail.getChild("eyes_l");
		this.eye1_l = this.eyes_l.getChild("eye1_l");
		this.eye2_l = this.eyes_l.getChild("eye2_l");
		this.eye3_l = this.eyes_l.getChild("eye3_l");
		this.eye4_l = this.eyes_l.getChild("eye4_l");
		this.eye5_l = this.eyes_l.getChild("eye5_l");
		this.eye6_l = this.eyes_l.getChild("eye6_l");
		this.sideeyes = this.head_detail.getChild("sideeyes");
		this.sideyes_l = this.sideeyes.getChild("sideyes_l");
		this.sideeye1_l = this.sideyes_l.getChild("sideeye1_l");
		this.sideeye2_l = this.sideyes_l.getChild("sideeye2_l");
		this.sideeye3_l = this.sideyes_l.getChild("sideeye3_l");
		this.sideeye4_l = this.sideyes_l.getChild("sideeye4_l");
		this.sideeye5_l = this.sideyes_l.getChild("sideeye5_l");
		this.sideeye6_l = this.sideyes_l.getChild("sideeye6_l");
		this.sideyes_r = this.sideeyes.getChild("sideyes_r");
		this.sideeye2_r = this.sideyes_r.getChild("sideeye2_r");
		this.sideeye1_r = this.sideyes_r.getChild("sideeye1_r");
		this.sideeye3_r = this.sideyes_r.getChild("sideeye3_r");
		this.sideeye4_r = this.sideyes_r.getChild("sideeye4_r");
		this.sideeye5_r = this.sideyes_r.getChild("sideeye5_r");
		this.sideeye6_r = this.sideyes_r.getChild("sideeye6_r");
		this.nose = this.head_detail.getChild("nose");
		this.nose1 = this.nose.getChild("nose1");
		this.nose2 = this.nose.getChild("nose2");
		this.mouth = this.head_detail.getChild("mouth");
		this.mouth1 = this.mouth.getChild("mouth1");
		this.mouth2 = this.mouth.getChild("mouth2");
		this.ears_l = this.head_detail.getChild("ears_l");
		this.topear_l = this.ears_l.getChild("topear_l");
		this.sideear_l = this.ears_l.getChild("sideear_l");
		this.ears_r = this.head_detail.getChild("ears_r");
		this.topear_r = this.ears_r.getChild("topear_r");
		this.sideear_r = this.ears_r.getChild("sideear_r");
		this.arm_l = this.bodygroup.getChild("arm_l");
		this.arm_r = this.bodygroup.getChild("arm_r");
		this.frontleg_l = this.bodygroup.getChild("frontleg_l");
		this.frontleg_r = this.bodygroup.getChild("frontleg_r");
		this.leg_l = this.rootgroup.getChild("leg_l");
		this.leg_r = this.rootgroup.getChild("leg_r");
		this.tail1 = this.rootgroup.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData rootgroup = modelPartData.addChild("rootgroup", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

		ModelPartData bodygroup = rootgroup.addChild("bodygroup", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = bodygroup.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData bodyseg1 = body.addChild("bodyseg1", ModelPartBuilder.create().uv(0, 21).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bodyseg2 = body.addChild("bodyseg2", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -5.0F, -2.0F, 8.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData headgroup = bodygroup.addChild("headgroup", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -10.0F, 0.0F));

		ModelPartData neck = headgroup.addChild("neck", ModelPartBuilder.create().uv(32, 1).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = headgroup.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

		ModelPartData head_detail = head.addChild("head_detail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData snout = head_detail.addChild("snout", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.0F, -4.0F));

		ModelPartData snout1 = snout.addChild("snout1", ModelPartBuilder.create().uv(9, 6).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData snout2 = snout.addChild("snout2", ModelPartBuilder.create().uv(24, 26).cuboid(-2.0F, -1.0F, -4.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData eyes_r = head_detail.addChild("eyes_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eye1_r = eyes_r.addChild("eye1_r", ModelPartBuilder.create().uv(24, 19).cuboid(-3.0F, -1.0F, -4.02F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eye2_r = eyes_r.addChild("eye2_r", ModelPartBuilder.create().uv(24, 19).mirrored().cuboid(-3.0F, -1.0F, -4.02F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eye3_r = eyes_r.addChild("eye3_r", ModelPartBuilder.create().uv(24, 19).cuboid(-3.0F, -1.0F, -4.02F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData eye4_r = eyes_r.addChild("eye4_r", ModelPartBuilder.create().uv(24, 18).cuboid(-2.0F, -2.0F, -4.02F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData eye5_r = eyes_r.addChild("eye5_r", ModelPartBuilder.create().uv(25, 19).cuboid(-1.0F, -1.0F, -4.02F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData eye6_r = eyes_r.addChild("eye6_r", ModelPartBuilder.create().uv(24, 20).cuboid(-2.0F, -2.0F, -4.02F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData eyes_l = head_detail.addChild("eyes_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eye1_l = eyes_l.addChild("eye1_l", ModelPartBuilder.create().uv(24, 19).mirrored().cuboid(-3.0F, -1.0F, -4.02F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData eye2_l = eyes_l.addChild("eye2_l", ModelPartBuilder.create().uv(24, 19).cuboid(-3.0F, -1.0F, -4.02F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData eye3_l = eyes_l.addChild("eye3_l", ModelPartBuilder.create().uv(24, 19).cuboid(-3.0F, -1.0F, -4.02F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData eye4_l = eyes_l.addChild("eye4_l", ModelPartBuilder.create().uv(25, 18).cuboid(-3.0F, -2.0F, -4.02F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData eye5_l = eyes_l.addChild("eye5_l", ModelPartBuilder.create().uv(25, 19).cuboid(-3.0F, -1.0F, -4.02F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData eye6_l = eyes_l.addChild("eye6_l", ModelPartBuilder.create().uv(24, 20).mirrored().cuboid(-3.0F, -2.0F, -4.02F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData sideeyes = head_detail.addChild("sideeyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData sideyes_l = sideeyes.addChild("sideyes_l", ModelPartBuilder.create(), ModelTransform.pivot(-0.075F, 0.0F, 0.0F));

		ModelPartData sideeye1_l = sideyes_l.addChild("sideeye1_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r1 = sideeye1_l.addChild("cube_r1", ModelPartBuilder.create().uv(24, 19).mirrored().cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideeye2_l = sideyes_l.addChild("sideeye2_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r2 = sideeye2_l.addChild("cube_r2", ModelPartBuilder.create().uv(24, 19).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideeye3_l = sideyes_l.addChild("sideeye3_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r3 = sideeye3_l.addChild("cube_r3", ModelPartBuilder.create().uv(24, 19).cuboid(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideeye4_l = sideyes_l.addChild("sideeye4_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r4 = sideeye4_l.addChild("cube_r4", ModelPartBuilder.create().uv(25, 18).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideeye5_l = sideyes_l.addChild("sideeye5_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r5 = sideeye5_l.addChild("cube_r5", ModelPartBuilder.create().uv(25, 19).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideeye6_l = sideyes_l.addChild("sideeye6_l", ModelPartBuilder.create(), ModelTransform.pivot(7.9F, 0.0F, -4.9F));

		ModelPartData cube_r6 = sideeye6_l.addChild("cube_r6", ModelPartBuilder.create().uv(24, 20).mirrored().cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-3.8F, 0.0F, 2.9F, 0.0F, -1.5708F, 0.0F));

		ModelPartData sideyes_r = sideeyes.addChild("sideyes_r", ModelPartBuilder.create(), ModelTransform.pivot(0.075F, 0.0F, 0.1F));

		ModelPartData sideeye2_r = sideyes_r.addChild("sideeye2_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r7 = sideeye2_r.addChild("cube_r7", ModelPartBuilder.create().uv(24, 19).mirrored().cuboid(-4.0F, 0.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -1.0F, -0.2F, 0.0F, 1.5708F, 0.0F));

		ModelPartData sideeye1_r = sideyes_r.addChild("sideeye1_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r8 = sideeye1_r.addChild("cube_r8", ModelPartBuilder.create().uv(24, 19).cuboid(-3.9F, 0.0F, -4.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -1.0F, -0.1F, 0.0F, 1.5708F, 0.0F));

		ModelPartData sideeye3_r = sideyes_r.addChild("sideeye3_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r9 = sideeye3_r.addChild("cube_r9", ModelPartBuilder.create().uv(24, 19).mirrored().cuboid(-4.9F, 0.0F, -4.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -1.0F, -0.1F, 0.0F, 1.5708F, 0.0F));

		ModelPartData sideeye4_r = sideyes_r.addChild("sideeye4_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r10 = sideeye4_r.addChild("cube_r10", ModelPartBuilder.create().uv(25, 18).mirrored().cuboid(-4.9F, -1.0F, -4.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -1.0F, -1.1F, 0.0F, 1.5708F, 0.0F));

		ModelPartData sideeye5_r = sideyes_r.addChild("sideeye5_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r11 = sideeye5_r.addChild("cube_r11", ModelPartBuilder.create().uv(25, 19).mirrored().cuboid(-4.9F, 0.0F, -4.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.0F, -1.0F, -2.1F, 0.0F, 1.5708F, 0.0F));

		ModelPartData sideeye6_r = sideyes_r.addChild("sideeye6_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.1F, 0.0F, -4.9F));

		ModelPartData cube_r12 = sideeye6_r.addChild("cube_r12", ModelPartBuilder.create().uv(24, 20).cuboid(-5.9F, -1.0F, -4.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -1.0F, -2.1F, 0.0F, 1.5708F, 0.0F));

		ModelPartData nose = head_detail.addChild("nose", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, -4.0F));

		ModelPartData nose1 = nose.addChild("nose1", ModelPartBuilder.create().uv(25, 16).cuboid(-1.0F, -0.025F, 0.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(24, 16).cuboid(-1.0F, -0.025F, 0.0F, 2.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.025F));

		ModelPartData nose2 = nose.addChild("nose2", ModelPartBuilder.create().uv(25, 16).cuboid(-2.0F, -0.025F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(25, 16).cuboid(1.0F, -0.025F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -0.025F));

		ModelPartData mouth = head_detail.addChild("mouth", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -3.925F));

		ModelPartData mouth1 = mouth.addChild("mouth1", ModelPartBuilder.create().uv(24, 17).cuboid(-2.0F, 0.975F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(25, 14).cuboid(2.025F, 0.975F, -0.2F, 0.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(25, 14).cuboid(-2.025F, 0.975F, -0.2F, 0.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.1F));

		ModelPartData mouth2 = mouth.addChild("mouth2", ModelPartBuilder.create().uv(24, 22).cuboid(-2.0F, -1.9F, -0.1F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.9F, 0.0F));

		ModelPartData ears_l = head_detail.addChild("ears_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData topear_l = ears_l.addChild("topear_l", ModelPartBuilder.create().uv(11, 6).cuboid(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -4.0F, 2.0F));

		ModelPartData sideear_l = ears_l.addChild("sideear_l", ModelPartBuilder.create(), ModelTransform.of(4.0F, -1.4F, 1.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r13 = sideear_l.addChild("cube_r13", ModelPartBuilder.create().uv(11, 6).cuboid(0.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.1F, -1.5708F, 0.0F, 0.0F));

		ModelPartData ears_r = head_detail.addChild("ears_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData topear_r = ears_r.addChild("topear_r", ModelPartBuilder.create().uv(11, 6).mirrored().cuboid(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.5F, -4.0F, 2.0F));

		ModelPartData sideear_r = ears_r.addChild("sideear_r", ModelPartBuilder.create().uv(11, 6).cuboid(-3.0F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -1.5F, 1.0F));

		ModelPartData arm_l = bodygroup.addChild("arm_l", ModelPartBuilder.create().uv(32, 12).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -8.0F, 0.0F));

		ModelPartData arm_r = bodygroup.addChild("arm_r", ModelPartBuilder.create().uv(32, 12).mirrored().cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-6.0F, -8.0F, 0.0F));

		ModelPartData frontleg_l = bodygroup.addChild("frontleg_l", ModelPartBuilder.create().uv(48, 12).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -8.0F, -2.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData frontleg_r = bodygroup.addChild("frontleg_r", ModelPartBuilder.create().uv(48, 12).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-2.0F, -8.0F, -2.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData leg_l = rootgroup.addChild("leg_l", ModelPartBuilder.create().uv(48, 12).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

		ModelPartData leg_r = rootgroup.addChild("leg_r", ModelPartBuilder.create().uv(48, 12).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-2.0F, 0.0F, 0.0F));

		ModelPartData tail1 = rootgroup.addChild("tail1", ModelPartBuilder.create().uv(44, 17).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, -2.0F, 1.0F));

		ModelPartData tail2 = tail1.addChild("tail2", ModelPartBuilder.create().uv(46, 17).mirrored().cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 6.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		rootgroup.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}